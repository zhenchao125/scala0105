package com.atguigu.day04.collectiondemo

object MapDemo1 {
    def main(args: Array[String]): Unit = {
        val arr1 = List(30, 50, 70, 60, 10, 20, 30, 20, 40, 70)
        
//        val arr2= arr1.map( x => x + 1 + "")
//        val arr2: List[(Int, Int)] = arr1.map(x => (x , 1))
        val arr2= arr1.map((_ , 1))
        println(arr2)
        
    }
}
/*

map:
    会返回新的集合
    调整集合中的数据类型
foreach:
    没有任何返回
 */