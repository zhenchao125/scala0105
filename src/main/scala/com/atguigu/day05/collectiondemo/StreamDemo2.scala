package com.atguigu.day05.collectiondemo

object StreamDemo2 {
    def main(args: Array[String]): Unit = {
//        numStream(10)
//        val stream: Stream[Int] = 10 #:: 11 #:: Stream[Int]()
//        println(stream.force)
        
        val stream: Stream[Int] = numStream(10)
        println("head:" + stream.head)
        println("head:" + stream.head)
        println("head:" + stream.head)
        println("head:" + stream.head)
        println("tail.head:" + stream.tail.head)
        println("tail.head:" + stream.tail.head)
    }
    
    def numStream(n: Int): Stream[Int] ={
        println(n)
        n #:: numStream(n + 1)
    }
}
