package com.atguigu.day05.collectiondemo

import scala.collection.SeqView

object ViewDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        
        val view1 = list1.toStream.map(x => {
            println("view:" + x)
            x
        })
        println(view1.head)
        println(view1.head)
        println(view1.head)
        
    }
}
