package com.atguigu.day06.generic

/**
  * Author lzc
  * Date 2019-05-28 15:39
  */
object GenericDemo4 {
    def main(args: Array[String]): Unit = {
        println(max1(1, 2))
        println(max1("a", "b"))
    }
    
    // T 类型可以被隐式的转换成 Comparable[T]
    def max[T <% Comparable[T]](a: T, b: T) = {
        if (a.compareTo(b) > 0) a else b
    }
    
    def max1[T <% Ordered[T]](a: T, b: T) = {
        
        if (a > b) a else b
    }
}
/*
视图界定

 */