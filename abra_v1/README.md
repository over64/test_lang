![ABRA](https://raw.githubusercontent.com/over64/abra_lang/master/abra.png)
### ABRA lang:
Research platform for design language with new memory management and modularity concepts
#### Build compiler
  For build compiler you just need Jdk8 and Sbt. Llvm 3.8 and Gcc also must be available in PATH
  ```bash
    sbt> assembly
  ```
  Get compiler in ```target/scala-2.11/kadabra.jar```. Demo programs stored in ```tl``` folder
#### Status
  Basic C-like expression-based language with type inference based on value types (no reference types yet)
  - val / var
  - if-else is expressions
  - while loops
  - Rich function call syntax: infix calls, unary calls, apply calls, get/set calls, self calls, usual calls
  - types: scalar and struct types (no arrays and ATD yet)
  - higher order functions
  - natural operator overloading (no 'operators' in language syntax)
  - smooth integration with LLVM via scalar types and inline LLVM IR
  - local type inference
  - uniform declaration syntax
  - Pyhton and Java-like modules system without any global variables
  - simple FFI to C via LLVM IR
  - stack-based closures
  - full-featured pattern matching

#### In progress in M2
  - type unions
  - named parameters
  - early returns
  - continue / break for while loops
  - refactor / tests

#### Hello, world
Yes, it is unicode, baby! If you have UTF8 locale...
```ruby
  import abra.io
  
  def main =
    'こんにちは、世界!'.print
```
#### Uniform declaration sytax
  WHAT_TO_DECLARE NAME [: TYPE_HINT] = INIT_EXPRESSION
  
  There is only one rule you need to know!
  ```ruby
    val a = 1
    var b: Double = 1.0
    
    def + = \self: Vec3, other: Vec3 ->
      Vec3(self.x + other.x, self.y + other.y, self.z + other.z)
      
    def >: (self: Int, other: Int) -> Boolean = llvm {
      %1 = icmp sgt i32 %self, %other
      ret i1 %1
    }
  ```
#### Types
  Predifined types by language specification:
  ```ruby
    type Unit = llvm { void }
    type Boolean = llvm { i1 }
    type Int = llvm { i32 }
    type Float = llvm { float }
    type String = llvm { i8* }
  ```
  Scalar types - types direct-mapped to raw LLVM types. Any LLVM type can be used in language. Even SIMD!
  ```ruby
    type Int = llvm { i32 }
    type SimdVec4f = llvm { <4 x float> }
  ```
  Struct types - composition of types (algebraic multiplication)
  ```ruby
    type Float = llvm { float }
    type Vec3 = (x: Float, y: Float: z: Float)
  ```
#### Functions
  Function body can be defined in 4 styles
  1. llvm inline IR block (function type hint required)
  2. code block: function type hint optional, block type hint required
  3. lambda-expression: function type-hint optional
  4. single-expression: no type hints

  last function expression is return value
  
  ```ruby
    # LLVM IR inline block
    def print: (self: String) -> Unit = llvm  {
      %1 = call i32 @puts(i8* %self)
      ret void
    }
    # Block
    def add = { x: Int, y: Int ->
     x + y
    }: Int
    
    def main = {
     0
    }: Int
    
    # Haskell-like lambdas
    def twice = \self: Int -> self + self
    
    # single-expression
    def Pi = 3.14
  ```
  
  Is it too much? No. Every syntax for it's own purpose for maximum eye-candy. Mind map:
  
  - __if__ function with llvm IR __then__ LLVM IR inline block
  - __else if__ function for const expression __then__ single-expression
  - __else if__ simple function which uses only one expression (often math functions) __then__ lambda-expression
  - __else__ code block

#### Function call
  Rich function call rules for eye-candy DSL
  ```ruby
    def +: (self: Int, other: Int) -> Int = llvm {
      %1 = add nsw i32 %other, %self
      ret i32 %1
    }
    
    def twice = \self: Int -> self + self
    def apply = \self: Int -> self + 9000
    
    1 + 1 # infix call
    1.twice # self call
    +(1, 1) # usual call
    1() # apply call
    # see get/set calls example in tl/abra/arrays.abra
  ```
#### If-else expressions
No parantheses, bro!
```ruby
  val a = false
  # if-else is expression
  # if-then style for single-expression
  val b = if a then 1 else 2
  # braces style for multi-expression. last expression is result
  val c = if a {
    foo()
    1
  } else 2
```
#### Loops
for loop is not needed and was removed.
Need imperative programming?
```ruby
  var a = 0
  while a < 255 {
    doSomethingLikeFather()
    a = a + 1
  }
```
#### Function pointers & anonymous functions
```ruby
def foo = { fn: (x: Int) -> Int, x: Int ->
  fn(x)
}: Int

def main = {
  val fn = \i: Int -> i + 1
  val a = foo(\i -> i + 1, 1)
  val b = foo({ i -> i + 1 }, 2)
  val c = foo(fn, 3)

  fn(0) + c + a + b
}: Int
```
#### Closures
```ruby
def foo = \i: Int, fn: (i: Int) -> Unit ->
  fn(i)

def main = {
    var x = 0

    val closure = { i: Int -> x = x + i }
    closure(1)

    # anonymous closure
    { i: Int ->
        x = x + i
    }(1)

    # pass anonymous closure as parameter
    foo(1, { i ->
        x = x + i
    })
    
    # Haskell-lambda style
    foo(1, \i -> x = x + i)

    x
}: Int
```
#### Pattern matching
```ruby
# Match is expression. Match over dash
val z = match 2
  of _ -> 'I dont care'
  
#Match over literals
match 0
  of 0 -> 'is zero'.println
    
# Match over variables
val x = 2
val z = match 2
  of $x -> x
  
# Match over expressions
val z = match 2
  of ${1 + 1} -> '1 + 1'
  
# Match with variable bind
val z = match 2
  of 1 -> 'is zero'
  of x -> 'something another: ' + x
  
# Match with guard
val on = 2
val z = match on
  of ${1 + 1} if rand() mod 2 == 0 -> 'good try!'
  
# Match with deep named destructuring
type Bar = (y: Int, z: Int)
type Foo = (x: Int, bar: Bar)

match Foo(1, Bar(2, 3))
        of Foo(1, bar = Bar(2, z)) -> bar.y + z
```