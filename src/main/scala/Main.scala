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

  def addWithoutSyntacticSugar(x: Int) = {
    new Function1[Int, Int]() {
      def apply(y: Int): Int = x + y
    }
  }

  def tailer(l: List[Int]): List[Int] = {
    l.tail
  }

  def setty(s: Set[Any], el: Any): Boolean = {
    s(el)
  }
}

object Main extends App {
  val result = Util.folder(None)
  println(result)
}


// https://www.scala-exercises.org/std_lib/options
