package com.atguigu.day04.high

object HighLevel4 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        //        foreachArray(arr1, x => println(x))
        //        foreachArray(arr1, println(_))
        
        
        //        foreachArray(arr1, println _)
        
        
        //        val r: Int = foo((a: Int, b: Int) => a * b)
        //        val r: Int = foo((a, b) => a * b)
        val r: Int = foo(_ + _)
        println(r)
    }
    
    def foo(f: (Int, Int) => Int) = {
        f(10, 200)
    }
    
    
    // 定义一个函数, 可以接受一个数组, 然后对数组中的每个元素按照传递过来的一个函数来操作
    def foreachArray(arr: Array[Int], f: Int => Unit) = {
        for (elem <- arr) {
            f(elem)
        }
    }
    
    
}

/*
高阶函数:
    接受一个函数作为参数或者返回一个函数作为返回值 这样的函数就叫高阶函数
    
匿名函数:
 

 */