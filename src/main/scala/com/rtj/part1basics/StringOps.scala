package com.rtj.part1basics

object StringOps {

  val aString: String = "Hello, I am learning Scala."

  // string functions
  val secondCharacter: String = aString.charAt(1)
  val firstWord: String = aString.substring(0, 5)
  val words: Array[String] = aString.split(" ")
  val starsWithHello: Boolean = aString.startsWith("Hello")


  def main(args: Array[String]): Unit = {

  }
}
