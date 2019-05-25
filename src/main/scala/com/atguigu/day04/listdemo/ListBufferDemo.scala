package com.atguigu.day04.listdemo

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019-05-25 10:02
  */
object ListBufferDemo {
    def main(args: Array[String]): Unit = {
        val buffer = mutable.ListBuffer(10,20,30,40)
        buffer += 10
//        println(buffer)
        println(buffer.toList)
        
    }
}
