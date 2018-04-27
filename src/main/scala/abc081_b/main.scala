package abc081_b

// https://abs.contest.atcoder.jp/tasks/abc081_b

import scala.io.StdIn
object Main extends App {
  def search(xs: Seq[Int], count: Int): Int = {
    if (xs.forall(_ % 2 == 0)) {
      search(xs.map(_ / 2), count + 1)
    } else count
  }
  
  val n = StdIn.readInt()
  
  val as = StdIn.readLine().split(" ").map(_.toInt)
  
  println(search(as, 0))
  
}
