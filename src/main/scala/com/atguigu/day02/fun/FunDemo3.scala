package com.atguigu.day02.fun

/**
  * Author lzc
  * Date 2019-05-22 09:04
  */
object FunDemo3 {
    def main(args: Array[String]): Unit = {
        /*println(add(1, 2, 3))
        println(add(10, 2, 3))
        println(add(1, 2, 3, 4, 6))*/
        // 当接收方是可变的时候,必须要展开集合
        println(add(1 to 100: _*))
        
    }
    
    def add(arr: Int*) = {
        var sum = 0
        for (elem <- arr) {
            sum += elem
        }
        sum
    }
    
    
}

/*

 
 */