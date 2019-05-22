package com.atguigu.day02.fun

/**
  * Author lzc
  * Date 2019-05-22 09:04
  */
object FunDemo2 {
    def main(args: Array[String]): Unit = {
        //        println(foo(10, 20))
        //        println(foo(10, 20, 200))
        println(foo(b = 200))
    
        println(foo(c = 1, b = 2, a = 10))
    }
    
    def foo(a: Int = 1, b: Int, c: Int = 100) = {
        a + b + c
    }
    
    
}

/*
参数的默认值:
    编译成字节码之后,其实是自动传递那个默认值过去
    
命名参数:
    命名参数配合默认可以简化函数的调用
 
 */