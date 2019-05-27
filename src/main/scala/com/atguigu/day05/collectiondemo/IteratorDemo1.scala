package com.atguigu.day05.collectiondemo

object IteratorDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        val it: Iterator[Int] = list1.toIterator
        
        /*while (it.hasNext) {
            println(it.next())
        }*/
    }
}
