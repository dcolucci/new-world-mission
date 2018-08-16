class Point(x: Int, y: Int) {
  override def toString(): String = "(" + x + ", " + y + ")"
}

object Util {
  def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
    if (flag) Some("Here's your f'n string") else None
  }

  def matcher(input: Option[String]): String = {
    val default = "[EMPTY]"
    input match {
      case Some(value) => value
      case None => default
    }
  }

  def getAnInt(input: Option[Int]): Int = {
    input.getOrElse(5)
  }

  def mapper(input: Option[Int]): Option[Int] = {
    input map(_ * 2)
  }

  def folder(input: Option[Int]): Int = {
    // question, how to express an identify / noop func?
    // input.fold(1)(_)
    input.fold(1)(_ * 3)
  }

  val randInt: () => Int = {
    val result = util.Random.nextInt
    () => result
  }
}

object Main extends App {
  val result1 = Util.randInt()
  val result2 = Util.randInt()
  val result3 = Util.randInt()
  println(result1)
  println(result2)
  println(result3)
}


// https://www.scala-exercises.org/std_lib/options
