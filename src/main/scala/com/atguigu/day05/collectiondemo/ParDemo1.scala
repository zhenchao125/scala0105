package com.atguigu.day05.collectiondemo

/**
  * Author lzc
  * Date 2019-05-27 14:08
  */
object ParDemo1 {
    def main(args: Array[String]): Unit = {
//        ((1 to 50)).par.foreach(println)
        ((1 to 50)).par.foreach(x => {
            println(Thread.currentThread().getName + "   " + x)
        })
    }
}
