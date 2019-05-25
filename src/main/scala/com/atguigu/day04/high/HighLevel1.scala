package com.atguigu.day04.high

/**
  * Author lzc
  * Date 2019-05-25 11:19
  */
object HighLevel1 {
    def main(args: Array[String]): Unit = {
        //提示scala不是在调用函数, 而是把函数本身当成一个值, 赋值给变量
        val a = add _
        
        val r: Int = a(10, 20)
        println(r)
        
        var f = foo _
        
        val sqrt = Math.sqrt _
        println(sqrt(10))
        
    }
    
    def add(a: Int, b: Int) = a + b
    
    def foo = println("aaa")
    
}
/*
作为值的函数:

有了一个函数, 我们可以对他做什么:
    1. 调用它
    2. 传递它
            函数式头等公民
            
            1. 给变量值
            2. 作为实参
            3. 把函数作为返回值返回


 */
