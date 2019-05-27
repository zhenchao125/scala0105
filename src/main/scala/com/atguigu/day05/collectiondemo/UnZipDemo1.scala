package com.atguigu.day05.collectiondemo

object UnZipDemo3 {
    def main(args: Array[String]): Unit = {
        val t = List((30,3), (50,5), (70,7), (60,6), (1000,1), (1000,2))
        val r: (List[Int], List[Int]) = t.unzip
        println(r)
    }
}
/*

 */