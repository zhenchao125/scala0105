package com.atguigu.day04.queuedemo

import scala.collection.mutable

object QueueDemo1 {
    def main(args: Array[String]): Unit = {
        val q = mutable.Queue(10,20,30)
        q.enqueue(100)
        println(q)
        q.dequeue()
        println(q)
    
    }
}
