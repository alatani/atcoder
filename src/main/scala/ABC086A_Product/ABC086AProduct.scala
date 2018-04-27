package ABC086A_Product

// https://abs.contest.atcoder.jp/tasks/abc086_a

import scala.io.StdIn
object Main extends App {
  
  val lines = StdIn.readLine().split(" ")
  val a=lines(0).toInt
  val b=lines(1).toInt
  
  if(a*b % 2 ==0){
    println("Even")
  }else{
    println("Odd")
  }
  
}
