package com.atguigu.day04.homework

object Homework3 {
    def main(args: Array[String]): Unit = {
        println(120 +% 10)
    }
    
    implicit class Rich(n: Int){
        def +%(ratio: Int) ={
            n * (1 + ratio.toDouble / 100 )
        }
    }
}

/*
3. 定义一个操作符 +% , 可以将一个给定的百分百添加到某个值
    比如 120 +% 10  应该得到 132
 */