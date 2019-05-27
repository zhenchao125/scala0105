package com.atguigu.day05.collectiondemo

import scala.collection.immutable

object ZipDemo3 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        val list: List[(Int, Int)] = list1.zipWithIndex
        println(list)
        
        /*val index: immutable.IndexedSeq[(Char, Int)] = "hellohello".zipWithIndex
        println(index)*/
    }
}
