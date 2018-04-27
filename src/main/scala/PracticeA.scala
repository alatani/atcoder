import scala.io.StdIn

object PracticeA extends App {
  
  val a = StdIn.readInt()
  
  val bc = StdIn.readLine().split(" ").map{ str =>
    str.toInt
  }.sum
  
  val s = StdIn.readLine()
  
  println(s"${a+bc} $s")
}
