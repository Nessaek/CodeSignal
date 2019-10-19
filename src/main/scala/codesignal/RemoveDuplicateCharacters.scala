package codesignal

object RemoveDuplicateCharacters {

  def removeDuplicateCharacters(str: String): String = {

    str.toSeq.filter(item => str.count(_ == item) == 1).unwrap

  }

}
