package com.rtj.part1basics

object CBNvsCBV {

  def aFunction(arg: Int): Int = {
    arg + 1
  }

  val aComputation = aFunction(23 + 67)

  def aByNameFunction(arg: => Int): Int = {
    arg + 1
  }

  val anotherComputation = aByNameFunction(23 + 67)



  def printTwiceByValue(x: Long): Unit = {
    println("By name " + x)
    println("By name " + x)
  }

  def printTwiceByName(x: => Long): Unit = {
    println("By name " + x)
    println("By name " + x)
  }
  def main(args: Array[String]): Unit = {
    printTwiceByValue(System.nanoTime())
    printTwiceByName(System.nanoTime())
  }

}
