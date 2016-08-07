package com.apple

object IfElse {
  def main(args: Array[String]): Unit = {
    val age = 10;
    if (age >= 5 && age <= 6) {
      println("Goto KinderGarten")
    } else if (age >= 6 && age <= 7) {
      println("Goto grade 1")
    } else {
      println("Goto grade " + (age - 5))
    }
    println("done")
  }
}