package com.atguigu.day04.high

object HighLevel3 {
    def main(args: Array[String]): Unit = {
        
        def f1(a: Int) = println(a + " >>> ")
        
        foreachArray(Array(10, 20, 30), f1 _)
        println("-----")
        
//        foreachArray(Array(10, 20, 30), a => println(a + 2))
        foreachArray(Array(10, 20, 30), println(_))
        
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