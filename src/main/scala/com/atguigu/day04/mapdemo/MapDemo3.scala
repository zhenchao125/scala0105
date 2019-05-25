package com.atguigu.day04.mapdemo

import scala.collection.mutable

object MapDemo3 {
    def main(args: Array[String]): Unit = {
        val map1 = mutable.Map(("a", 98), ("c", 99), ("d", 99), ("e", 99))
        map1 -= "a"
        println(map1)
        /*for (elem <- map1) {
            println(elem._1)
        }*/
    
        /*for ((k, 99) <- map1) {
            println(k)
        }*/
    }
}
