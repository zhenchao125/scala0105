package com.atguigu.day04.arr

/**
  * Author lzc
  * Date 2019-05-25 09:11
  */
object OperationDemo {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        println(arr1.head)
        println(arr1.last)
        println(arr1.tail.mkString(", "))
    }
}
