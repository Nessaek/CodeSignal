package codesignal

object ContainsDuplications {

  def containsDuplicates(a: Array[Int]): Boolean = {

    if(a.exists(int => a.count(_ == int) > 2)) true else false
  }

}
