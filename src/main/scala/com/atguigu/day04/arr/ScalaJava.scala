package com.atguigu.day04.arr

import java.util

import scala.collection.mutable.ArrayBuffer

/**
  * Author lzc
  * Date 2019-05-25 09:01
  */
object ScalaJava {
    def main(args: Array[String]): Unit = {
       /* val arr = new util.ArrayList[Int]()
        arr.add(1)
        arr.add(10)
        arr.add(100)
//        for(e <- arr){
//            println(e)
//        }
        println(arr(0))*/
        import scala.collection.JavaConversions._
    
        val arrScala = ArrayBuffer("a", "b", "c")
        // 获取到Java的中的List对象
        val listJava: util.List[String] = arrScala
        println(listJava)  // ["a", "b", "c"]
    
    
    }
}
