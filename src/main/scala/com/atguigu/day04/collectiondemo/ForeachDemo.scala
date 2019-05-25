package com.atguigu.day04.collectiondemo

object ForeachDemo {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 50, 70, 60, 10, 20)
//        arr1.foreach(x =>println(x))
        arr1.foreach(println(_))
        arr1.foreach(println)
    }
}

/*
1. for
2. 得到下标, 遍历所有的下标
不够函数式

算子:(高阶函数)
 */