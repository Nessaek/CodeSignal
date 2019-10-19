package codesignal

object AlternatingSums  {

  def alternatingSums(a: Array[Int]): Array[Int] = {
   val line: (List[(Int, Int)], List[(Int, Int)]) =  a.toList.zipWithIndex.partition(elem => elem._2 == 0 || elem._2 % 2 == 0)

    val list1 = line._1.map(_._1).sum

    val list2 = line._2.map(_._1).sum
    Array(list1, list2)

  }

}
