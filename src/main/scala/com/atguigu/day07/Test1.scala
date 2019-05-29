package com.atguigu.day07

/**
  * Author lzc
  * Date 2019-05-29 11:32
  */
object Test1 {
    def main(args: Array[String]): Unit = {
        val p1 = new Person(10)
        println(p1.unary_+)
        println(+p1)
        
        val arr = Array(10,20)
        println(arr(0))
        println(arr.apply(0))
        
        arr(0) = 100
        arr.update(0, 100)
        println(arr(0))
        
        val f = foo _
        
        f()
        f.apply()
        
        
    }
    
    
    def foo() ={
        println("foo...")
    }
}
class Person(val age:Int) {
    
    def unary_+ = {
        age + 10
    }
}

/*
前置运算符
 */