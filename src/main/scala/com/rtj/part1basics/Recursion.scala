package com.rtj.part1basics

import scala.annotation.tailrec

object Recursion {

  // repetition = recursion
  def sumUntil(n: Int): Int = {
    if (n <= 0) 0
    else n + sumUntil(n - 1)
  }



  def sumNumbersBetween(a: Int, b: Int): Int = {
    if (a > b) 0
    else a + sumNumbersBetween(a + 1, b)
  }

  def sumNumbersBetween_v2(a: Int, b: Int): Int = {
    @tailrec
    def sumTailrec(currentNumber: Int, accumulator: Int): Int = {
      if (currentNumber > b) accumulator
      else sumTailrec(currentNumber + 1, currentNumber + accumulator)
    }
    sumTailrec(a, 0)
  }

  def concatString(word: String, n: Int): String = {
    if (n <= 0) ""
    else word + concatString(word, n - 1)
  }

  def concatString_v2(word: String, n: Int): String = {
    def concatTailrec(remainingTimes: Int, accumulator: String): String = {
      if (remainingTimes <= 0) accumulator
      else concatTailrec(remainingTimes - 1, accumulator + word)
    }
    concatTailrec(n, "")
  }

  def sumUntil_v2(n: Int): Int = {
    @tailrec
    def sumUntilTailrec(x: Int, accumulator: Int): Int = {
      if (x <= 0) accumulator
      else sumUntilTailrec(x - 1, accumulator + n)
    }
    sumUntilTailrec(n, 0)
  }

  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciTailrec(x: Int, accumulator: Int): Int = {
      if (x <= 0) accumulator
      else fibonacciTailrec(n - 1, accumulator + n)
    }
    fibonacciTailrec(n, 0)
  }


  def main(args: Array[String]): Unit = {
    println(sumUntil(10))
    println(concatString("Dupa", 5))
    println(concatString_v2("Dupa", 5))

  }

}
