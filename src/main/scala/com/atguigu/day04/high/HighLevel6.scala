package com.atguigu.day04.high

object HighLevel6 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        foreachArray(arr1, println(_))
        
    }
    
    
    // 定义一个函数, 可以接受一个数组, 然后对数组中的每个元素按照传递过来的一个函数来操作
    def foreachArray(arr: Array[Int], f: Int => Unit) = {
        for (elem <- arr) {
            f(elem)
        }
    }
    
    
}

/*
1. 部分应用函数

 

 */