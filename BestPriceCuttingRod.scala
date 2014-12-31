/*
 Problem statement:
===================
   Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n. 
   Determine the maximum value obtainable by cutting up the rod and selling the pieces.

DP-solution approach

*/

import scala.math._

object BestPrice extends App {
   def calculateBestPrice(prices:List[Int],n:Int)={
     val valList = Array.ofDim[Int](n+1)
     for (i <- 1 to n) {
       var maxVal = -1
       for (j <- 0 until i) maxVal = max(maxVal,prices(j) + valList(i-j-1))
       valList(i) = maxVal
     }
     valList(n) 
   }
   
  val priceList = List(1,5,8,9,10,17,17,20)
  println("BestPrice:"+calculateBestPrice(priceList,priceList.length))

}
