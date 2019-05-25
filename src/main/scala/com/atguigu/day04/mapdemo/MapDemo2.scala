package com.atguigu.day04.mapdemo

import scala.collection.mutable

object MapDemo2 {
    def main(args: Array[String]): Unit = {
        val map1 = mutable.Map(("a", 98), ("c", 99))
        map1 += "d" -> 100
        println(map1)
        
        var map2 = Map(("a", 98), ("c", 99))
        map2 += "d" -> 100
        println(map2)
        
        
    }
}
