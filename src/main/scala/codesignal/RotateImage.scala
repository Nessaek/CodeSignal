package codesignal

object RotateImage {

  def rotateImage(a: Array[Array[Int]]): Array[Array[Int]] = {

    a.transpose.map(array => array.reverse)
  }


}
