package codesignal

object CommonCharacterCount extends App {

  def commonCharacterCount(s1: String, s2: String): Int = {

   s1.toSeq.intersect(s2).length

  }

}
