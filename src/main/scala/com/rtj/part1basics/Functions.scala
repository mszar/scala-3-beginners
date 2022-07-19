package com.rtj.part1basics

object Functions {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  val aFunctionInvocation = aFunction("Scala", 99999)

  def aNoArgFunction(): Int = 45
  def aParameterlessFunction: Int = 45

  def stringConcatenation(str: String, n: Int): String = {
    if (n == 0) ""
    else if (n == 1) str
    else str + stringConcatenation(str, n - 1)
  }

  val scalax3 = stringConcatenation("Scala", 3)

  // void function
  def aVoidFunction(aString: String): Unit = {
    println(aString)
  }

  def greetingFunction(name: String, age: Int): String = {
    "Hi my name is " + name + " and I am " + age + " years old"
  }

  def factorial(n: Int): Int = {
    if (n <= 0) 0
    else if (n == 1) 1
    else factorial(n-1) * n
  }

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  def primeTest(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }
    isPrimeUntil(n / 2)
  }

  def main(args: Array[String]): Unit = {
    println(factorial(6))
    println(fibonacci(10))
    println(primeTest(8))
  }
}
