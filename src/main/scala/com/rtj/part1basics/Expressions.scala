package com.rtj.part1basics

object Expressions {

  val meaningOfLife: Int = 40 + 2

  // math expressions: *, +, -, /
  val mathExpressions: Int = 2 + 3 * 4

  // comparison expressions: <, <=, >, >=, ==, !=
  val equalityTest: Boolean = 1 == 2

  // boolean expressions: !, ||, &&
  val nonEqualityTest: Boolean = !equalityTest

  // instructions vs expressions
  // expressions are evaluated, instructions are executed
  // we think in terms of expressions

  // ifs are expressions
  val aCondition = true
  val anIfExpression: Int = if (aCondition) 45 else 99

  // code block
  val aCodeBlock = {
    // local values
    val localValue = 78
    localValue + 54
  }

   

  def main(args: Array[String]): Unit = {
    println(anIfExpression)
  }
}
