package com.atguigu.day01.optdemo

import java.io.{BufferedReader, InputStreamReader}

import scala.io.StdIn

/**
  * Author lzc
  * Date 2019-05-21 14:35
  */
object ReadInStd {
    def main(args: Array[String]): Unit = {
        val line: String = StdIn.readLine("请输入你的年龄:")
        println(line)
    }
}
/*
Scanner  jdk 1.5
 val reader = new BufferedReader(new InputStreamReader(System.in))


 */
