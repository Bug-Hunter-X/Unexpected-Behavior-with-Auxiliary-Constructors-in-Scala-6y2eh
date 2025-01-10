```scala
class MyClass(val value: Int) {
  def this() = this(0) 
}

object Main extends App {
  val myInstance = new MyClass()
  println(myInstance.value) // Output: 0
  
  val myInstance2 = new MyClass(5) 
  println(myInstance2.value) // Output: 5
  
  // Example of potential error
  val myInstance3 = new MyClass { override val value = 10}
  println(myInstance3.value) // Output: 10 - This may be unexpected if the primary constructor value is not used in subsequent code
}
```