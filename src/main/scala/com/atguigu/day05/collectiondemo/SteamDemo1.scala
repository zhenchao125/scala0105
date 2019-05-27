package com.atguigu.day05.collectiondemo

object SteamDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        
        val stream: Stream[Int] = list1.toStream
        /*println(stream.head)
        println(stream.tail)
        println(stream.last)*/
//        println(stream.take(3))
        val force: Stream[Int] = stream.force
        println(force)
        
    }
}
