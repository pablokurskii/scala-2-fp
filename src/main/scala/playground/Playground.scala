package playground

object Playground {

  def main(args: Array[String]): Unit = {
    println("11")

    var generatorScala3 =
      for
        n <- List(1, 2, 3)
        s <- List("s", "d")
      yield s"$n,$s"

    println(generatorScala3)
  }

}
