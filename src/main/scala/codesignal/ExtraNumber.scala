package codesignal

object ExtraNumber {

  def extraNumber(a: Int, b: Int, c: Int): Int = {

    val list = List(a, b, c)
    list.filter(item => list.count(_ == item) == 1).head

  }

}
