package com.atguigu.day04.collectiondemo

object FlatMapDemo1 {
    def main(args: Array[String]): Unit = {
        val lines = List("hello wold", "hello atguigu", "hao are you")
        // (hello,1),(world,1)....
        val list2 = lines.flatMap(x => x.split(" ")).map((_, 1))
        println(list2)
    }
}
