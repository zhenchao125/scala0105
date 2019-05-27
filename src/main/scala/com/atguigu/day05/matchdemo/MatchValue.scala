package com.atguigu.day05.matchdemo

import scala.io.StdIn

/**
  * Author lzc
  * Date 2019-05-27 14:17
  */
object MatchValue {
    def main(args: Array[String]): Unit = {
        val m: Int = StdIn.readInt()
        val n: Int = StdIn.readInt()
        val operator = StdIn.readLine("输入一个运算符: ")
        var value = operator match {
            case "+" =>
                m + n
            case "-" =>
                m - n
            case "*" =>
                m * n
            case "/" =>
                m / n
            case _ => 0
        }
        println(value)
    }
    
}
