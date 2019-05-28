package com.atguigu.day06.generic

object GenericDemo1 {
    def main(args: Array[String]): Unit = {
        //        new Point[Int](1, 2)
        val point = new Point(1.1, 2)
        val str: String = point.say("abc")
    }
}

class Point[T, V](val x: T, val y: V) {
    var z: T = _
    
    def foo(a: T) = {
    
    }
    
    def say[K](a: K) = {
        a
    }
    
}


/*
泛型类

泛型函数


 */
