package com.atguigu.day04.high

/**
  * Author lzc
  * Date 2019-05-25 14:23
  */
object CurryDemo1 {
    implicit val a = 100
    def main(args: Array[String]): Unit = {
        println(add(10)(200))
        println(add(10)(300))
    
        println(add(100))
        println(add(200))
    }
    
    //    def add(a:Int) = (b: Int) => a + b
    def add(a: Int)(implicit b: Int) = a + b
}

/*
柯里化:
    把一个参数列表, 分解多个参数列表
 */