```scala
class MyClass(val value: Int) {
  def this() = this(0) 
}

object Main extends App {
  val myInstance = new MyClass()
  println(myInstance.value) // Output: 0
  
  val myInstance2 = new MyClass(5) 
  println(myInstance2.value) // Output: 5
  
  // Solution: Explicitly use the auxiliary constructor and avoid overriding the primary constructor parameter in anonymous class instantiations.
  val myInstance3 = new MyClass()
  println(myInstance3.value) // Output: 0 (Corrected behavior)
  
  // Or, if modification of the value is necessary after creation:
  val myInstance4 = new MyClass(10)
  println(myInstance4.value) // Output: 10 (Direct instantiation)
}
```