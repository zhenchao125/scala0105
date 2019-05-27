package com.atguigu.day05.collectiondemo

object ScanDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
//        val list2: List[Int] = list1.scanLeft(0)(_ + _)
        val list2: List[Int] = list1.scanRight(0)(_ + _)
        println(list2)
    }
}
/*
scan
    会把中间折叠的结果给保留下来
 */
