package com.rtj.part1basics

import scala.annotation.tailrec

object DefaultArgs {

  @tailrec
  def sumUntilTailrec(x: Int, accumulator: Int = 0): Int = {
    if (x <= 0) accumulator
    else sumUntilTailrec(x - 1, accumulator + x)
  }
  val sumUntil100: Int = sumUntilTailrec(100)

  def main(args: Array[String]): Unit = {
    println(sumUntil100)
  }

}
