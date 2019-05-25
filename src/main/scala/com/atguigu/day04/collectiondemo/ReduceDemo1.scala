package com.atguigu.day04.collectiondemo

/**
  * Author lzc
  * Date 2019-05-25 16:05
  */
object ReduceDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
//        val sum: Int = list1.reduce((x, y) => x + y)
        val sum: Int = list1.reduce(_ + _)
        println(sum)
        
    }
}
