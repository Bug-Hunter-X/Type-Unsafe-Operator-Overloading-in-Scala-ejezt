```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T])(implicit num: Numeric[T]): T = {
    num.plus(value, other.value) 
  }
}

object Main extends App {
  val instance1 = new MyClass(10)
  val instance2 = new MyClass(20)
  println(instance1.myMethod(instance2)) // Works for numbers

  //This example will not compile because it cannot find an implicit Numeric for String
  //val instance3 = new MyClass("hello")
  //val instance4 = new MyClass("world")
  //println(instance3.myMethod(instance4))
}
```