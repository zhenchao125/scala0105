package com.atguigu.day04.mapdemo

import scala.collection.mutable

object MapDemo1 {
    def main(args: Array[String]): Unit = {
        // 不可变
        val map1 = Map(("a", 98), ("c", 99))
        println(map1)
        
        val map2 = Map("a" -> 97, "b" -> 98)
    
        println(map2)
        
        val map3 = mutable.Map("a" -> 97, "b" -> 98)
        println(map3)
    
    
        println(map1("a"))
//        println(map1("d"))
        println(map1.getOrElse("d", 100))
        // 可变的才支持
        println(map3.getOrElseUpdate("d", 100))
        println(map3)
        
    }
}
