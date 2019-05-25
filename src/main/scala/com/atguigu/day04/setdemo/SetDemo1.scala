package com.atguigu.day04.setdemo

object SetDemo1 {
    def main(args: Array[String]): Unit = {
        var set1 = Set(30, 50, 70, 60, 10, 20)
        val set2 = Set(3, 50, 7, 60, 10, 2)
        
        //        println(set1 ++ set2)
        //        println(set1 | set2)  // 并集
        //        println(set1 & set2)  // 交集
        //        println(set1 &~ set2) // 差集
        println(set1.take(2))
        val list1 = List(30, 50, 70, 60, 10, 20)
        println(list1.take(3))
        
    }
}

/*
List
Map
Set
 */
