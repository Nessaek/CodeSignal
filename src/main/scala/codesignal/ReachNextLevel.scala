package codesignal

object ReachNextLevel {

  def reachNextLevel(experience: Int, threshold: Int, reward: Int): Boolean = {

    if(experience + reward >= threshold) true else false
  }


}
