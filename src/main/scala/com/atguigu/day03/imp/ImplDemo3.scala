package com.atguigu.day03.imp

/**
  * Author lzc
  * Date 2019-05-24 15:21
  */
object ImplDemo3 {
//    implicit val b = 40
    def main(args: Array[String]): Unit = {
        /*foo(10)
        foo(1200)*/
        
        implicit val c = 20
        
        foo // 隐式
        foo() // 默认
    }
    
    def foo(implicit a: Int = 200) = {
        println(a)
    }
}
