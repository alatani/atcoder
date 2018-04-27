package abc087_b

// https://abs.contest.atcoder.jp/tasks/abc081_b

import scala.io.StdIn
object Main extends App {

  
  val a = StdIn.readInt()  // 500
  val b = StdIn.readInt()  // 100
  val c = StdIn.readInt()  // 50
  val x = StdIn.readInt()
  
  def count50(a:Int,b:Int,c:Int,x:Int):Int = {
    if (a < 0 || b < 0 || c < 0) { return 0 }
    if (x == 0) { return 1 }
    
    count50(a,b,c-1,x-50)
  }
  def count100(a:Int,b:Int,c:Int,x:Int):Int ={
    if (a < 0 || b < 0 || c < 0) { return 0 }
    if (x == 0) { return 1 }
    
    count100(a,b-1,c,x-100) + count50(a,b,c,x)
  }
  def count500(a:Int,b:Int,c:Int,x:Int):Int ={
    if (a < 0 || b < 0 || c < 0) { return 0 }
    if (x == 0) { return 1 }
    
    count500(a-1,b,c,x-500) + count100(a,b,c,x)
  }
  
  println(count500(a,b,c,x).toString)
  
  
}
