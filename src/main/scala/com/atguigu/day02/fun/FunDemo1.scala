package com.atguigu.day02.fun

/**
  * Author lzc
  * Date 2019-05-22 08:48
  */
object FunDemo1 {
    def main(args: Array[String]): Unit = {
//        println(FunDemo1 add 100)
//        add()
//        add
//        1.toString()
//        println(add1)
        println(add2)
        println(add2)
        println(add1)
        println(add1)
    }
    
    val add2 ={
        println("add2...")
        200
    }
    
    def add1 ={
        println("add1...")
        109
    }
    
    def add() = {
        println("add...")
        10
    }
}

/*
函数的形参都是常量

1. 当没有参数的时候, 调用函数一般省略掉 ()
2. 如果使用 def 声明函数的时候, 省略掉了 (), 则调用的时候也必须省
 */