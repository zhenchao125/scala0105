package com.atguigu.day02.fun

/**
  * Author lzc
  * Date 2019-05-22 09:46
  */
object LazyDemo {
    lazy val a = {
        println("a...")
        10
    }
    val b = {
        println("b...")
        10
    }
    
    def main(args: Array[String]): Unit = {
        println(a)
        println(a)
    }
    
    
    val foo1 = {
        println("foo1...")
        10
    }
    
    lazy val foo2 = {
        println("foo2...")
        100
    }
    
    def foo3 = {
        println("foo3...")
        1000
    }
    
    
}
