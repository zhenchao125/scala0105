package com.atguigu.day01.optdemo

object OptDemo2 {
    def main(args: Array[String]): Unit = {
        val a = 200
        val b = 30
        
        
        val max = if (a > b) a else b
        
        println(max)
        
        var aa = 10
        var bb = 20
        println(bb = 100)
    }
}

/*
在scala中, 任何的语句都有值!

1. scala中, 赋值语句的值是 Unit  ()
 */