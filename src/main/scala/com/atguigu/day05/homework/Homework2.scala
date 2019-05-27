package com.atguigu.day05.homework

object Homework2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
    
        val maxMin: (Int, Int) = list1.foldLeft((Int.MinValue, Int.MaxValue))((t, x) => {
            (t._1.max(x), t._2.min(x))
        })
        println(maxMin)
    }
}
/*
2. 使用 foldLeft 同时计算最大值和最小值
 */