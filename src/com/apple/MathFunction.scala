package com.apple
import scala.math._

object MathFunction {
  def main(args: Array[String]): Unit = {
    println(abs(-8))
    println(ceil(8.23))
    println(floor(8.65))
    println(round(8.65))
    println(round(8.49))
    println(22/7)
    println(log10(1000))//exponential function
    println((random*(10)+1).toInt)//get a random number
  }
}