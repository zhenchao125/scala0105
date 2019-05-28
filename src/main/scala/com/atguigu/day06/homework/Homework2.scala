package com.atguigu.day06.homework

object Homework2 {
    def main(args: Array[String]): Unit = {
        val s: String = swap(Array(1)).mkString(",")
        println(s)
    }
    
    def swap(arr: Array[_])={
        arr match {
            case Array(a, b, rest@_*) =>
                Array(b, a) ++ rest
            case _ => arr
        }
    }
}
/*
 2. 利用模式匹配，编写一个 swap 函数，交换数组中前两个元素的位置，前提条件是数组长度至少为2
10,20,30,...
20,10,30...
*/