package com.atguigu.day05.matchdemo

import scala.io.StdIn

/**
  * Author lzc
  * Date 2019-05-27 14:17
  */
object MatchBaseUse {
    def main(args: Array[String]): Unit = {
        val m: Int = StdIn.readInt()
        val n: Int = StdIn.readInt()
        val operator = StdIn.readLine("输入一个运算符: ")
        operator match {
            case "+" =>
                println(m + n)
            case "-" =>
                println(m - n)
            case "*" =>
                println(m * n)
            case "/" =>
                println(m / n)
            case _ => println("你输入的运算符有误")
        }
    }
}
