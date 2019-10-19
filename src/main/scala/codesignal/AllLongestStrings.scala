package codesignal

//Works
object AllLongestStrings {


  def allLongestStrings(inputArray: Array[String]): Array[String] = {

    recursiveLong(inputArray, 0, Array.empty)
  }

  def recursiveLong(inputArray: Array[String], longestString: Int, listOfLongest: Array[String]): Array[String] = {

    if(inputArray.length == 0) listOfLongest

    else {
      val head = inputArray.head

      val tail = inputArray.tail

      if(head.length > longestString) recursiveLong(tail, head.length, Array(head))
      else if(head.length == longestString) recursiveLong(tail, longestString, listOfLongest :+ head)
      else {
        recursiveLong(tail, longestString, listOfLongest)
      }
    }


  }

}
