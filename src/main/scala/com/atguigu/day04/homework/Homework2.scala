package com.atguigu.day04.homework

/**
  * Author lzc
  * Date 2019-05-25 07:48
  */
object Homework2 {
    def main(args: Array[String]): Unit = {
        println(5 !)
    }
    
    implicit class RichInt(n: Int) {
        def ! = {
            jiecheng(n)
        }
        
        def jiecheng(n: Int): Int = {
            if (n == 1) 1
            else n * jiecheng(n - 1)
        }
    }
    
}

/*
2. 定义一个 ! 操作符, 计算某个整数的阶乘. 比如 5! 应该得到 120
 */