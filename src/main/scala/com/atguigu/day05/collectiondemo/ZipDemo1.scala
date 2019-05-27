package com.atguigu.day05.collectiondemo

object ZipDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60)
        val list2 = List(3, 5, 7, 6, 1, 2)
//        val t: List[(Int, Int)] = list1.zip(list2)
        val t: List[(Int, Int)] = list1.zipAll(list2, 1000, 2000)
        println(t)
    }
}
/*
长度不一样, 会抛弃掉多余的部分


在spark中也有拉链, spark 的中的拉链如果长度不一致, 直接抛异常
 */