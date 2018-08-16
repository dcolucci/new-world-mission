class Point(x: Int, y: Int) {
  override def toString(): String = "(" + x + ", " + y + ")"
}

class Util {
  def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
    if (flag) Some("Here's your f'n string") else None
  }
}

object Main extends App {
  val util = new Util()
  val result1 = util.maybeItWillReturnSomething(true)
  val result2 = util.maybeItWillReturnSomething(false)
  val finalResult: String = result1 getOrElse "4bogus"
  println(finalResult)
  // println(result2)
}


// https://www.scala-exercises.org/std_lib/options
