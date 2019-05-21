package com.atguigu.day01.optdemo

object OptDemo1 {
    def main(args: Array[String]): Unit = {
        var i = 1 + 2
        var j = 1 + 2
        
        println(i)
        println(j)
        val s: String = i toString
    
        println(s)
        
        i += 1  // java: i++
        i -= 1 // java: i--
        
        
        println(-10 % -3)
        
    }
}
/*
调用方法的的时候:
     . 可以省略
     如果只有一个参数或者没有参数, 则圆括号也可以省略
     

 */