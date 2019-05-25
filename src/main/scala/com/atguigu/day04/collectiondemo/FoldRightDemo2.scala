package com.atguigu.day04.collectiondemo

object FoldRightDemo2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 30, 50, 70, 60, 10, 20, 30, 10, 10)
//        val r: Int = list1.foldRight(0)(_ + _)
//        val r: Int = list1./:(0)(_ + _)
//        val r: Int = (0 /: list1)(_ + _)
        val r: Int = (list1 :\ 0)(_ + _)
        println(r)
        
    }
}
