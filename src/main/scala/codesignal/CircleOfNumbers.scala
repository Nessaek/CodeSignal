package codesignal

object CircleOfNumbers  {

  def circleOfNumbers(n: Int, firstNumber: Int): Int = {

    val half = n / 2

if(firstNumber > half) {
  firstNumber - half
}  else if (firstNumber == half) 0 else firstNumber + half

  }

}
