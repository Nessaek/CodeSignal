package codesignal

object KnapsackLight {


  def knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int = {

    if(weight1 + weight2 <= maxW) value1 + value2
    else{
      if(value1 > value2) {
        if(weight1 <= maxW) {
          value1
        } else {
          if(weight2 <= maxW) {
            value2
          } else {
            0
          }
        }
      } else {
        if(weight2 <= maxW) {
          value2
        } else {
          if(weight1 <= maxW) {
            value1
          } else 0
        }
      }
    }
  }


}
