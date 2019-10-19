package codesignal

object IsLucky extends App {


  def isLucky(n: Int): Boolean = {

    val listOfDigits = n.toString.toSeq.map(elem => elem.asDigit)


    val splitList: (IndexedSeq[Int], IndexedSeq[Int]) = listOfDigits.splitAt(listOfDigits.length / 2)

if(splitList._1.sum == splitList._2.sum) true else false
  }



}
