package com.atguigu.day04.high

object HighLevel5 {
    def main(args: Array[String]): Unit = {
        val f = foo(100)
        f(200)
        
    }
    
    def foo(n: Int) = {
        var m = n   // 100
        val f = (a: Int) => println(a + m)
        m = 200
        f
    }
}

/*
函数式编程语言的标配:
    1. 高阶函数
    2. 闭包
    3. 柯里化
        ...

闭包:
    如果一个函数访问了外部的变量, 则这个函数就可以称为一个闭包
    闭包会持有外部变量的值,
    
    闭包访问的 外部变量的值, 一定是最新的值!


 */