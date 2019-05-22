package com.atguigu.day02.fun

/**
  * Author lzc
  * Date 2019-05-22 09:29
  */
object FunDemo5 {
    def main(args: Array[String]): Unit = {
        // Nothing   NaN:  not a numbeer
        println(sqrt(16))
        println(sqrt(-16))
    }
    
    def sqrt(n: Double) = {
        if(n >= 0) Math.sqrt(n)
        else throw new IllegalArgumentException
    }
}
