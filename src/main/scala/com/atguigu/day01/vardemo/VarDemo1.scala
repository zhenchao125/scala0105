package com.atguigu.day01.vardemo

/**
  * Author lzc
  * Date 2019-05-21 10:37
  */
object VarDemo1 {
    def main(args: Array[String]): Unit = {
        var i: Int = 0
        i = 10
        println(i)
        
        var j = 20
        println(j)
        
        val a = 10
    }
}

/*
变量
    java: int i = 0
    
    scala:
        var 变量名: 类型 = 赋值
        
       变量声明的时候一定要同时进行初始化
       
       类型推导

常量
    java: final int i = 0
    
    scala:
        val 常量名: 类型 = 初始化
 
 重点:
 
 1. 知道怎么定义变量和常量
 
    var val
    
 2. 了解类型推导
 
 3. 尽量用常量
 

函数式:
    能用常量的地方不要用变量
 */