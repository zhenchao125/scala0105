package com.atguigu.day01.typedemo

/**
  * Author lzc
  * Date 2019-05-21 11:23
  */
object UnitDemo {
    def main(args: Array[String]): Unit = {
        val r: Unit = foo()
        println(r)
        
        //        println("123".toInt)
        //        println("a".toInt)
        //        println("a".toBoolean)
        
        val `a b`: Int = 10
        println(`a b`)
        // type
        val `type`: Int = 1
        
        val +-* = 20
        println(+-*)
        
    }
    
    def foo(): Unit = {
    
    }
}
