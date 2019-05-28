package com.atguigu.day06.abstractcontrol

object ControlDemo1 {
    def main(args: Array[String]): Unit = {
        //        foo2(f())
        foo1{
            println("aab")
            3
        }
        
        
        foo3{
            println("aaaaaa")
        }
    }
    def foo3(b: => Unit) ={
        b
    }
    
    
    def f() = {
        println("f....")
        3
    }
    
    //名调用
    def foo1(a: => Int) = {
        println(a)
        println(a)
        println(a)
    }
    
    // 值调用
    def foo2(a: Int) = {
        println(a)
        println(a)
        println(a)
    }
}

/*
值调用:
    调用函数的时候, 是直接传递计算好的是过去
名调用:
    并不会直接传递值过去, 而是传递一个表达式, 函数内什么实用什么时候去计算




var a = 0
mywhile(a <= 10){
    println(a)
    a += 1
}

 */