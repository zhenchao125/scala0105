package com.atguigu.day04.homework


object Homework1 {
    def main(args: Array[String]): Unit = {
        val point = Point(10, 2)
        
    }
}
object Point{
    def apply(x: Int, y: Int) = new Point(x, y)
}
class Point(val x: Int, val y:Int)


/*
1. 定义一个 Point 类和一个伴生对象,
使得我们可以不用 new 而直接用 Point(3,4)来构造 Point 实例
 */
