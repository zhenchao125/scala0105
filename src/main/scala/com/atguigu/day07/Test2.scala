package com.atguigu.day07

object OperatorDemo2 {
    def main(args: Array[String]): Unit = {
        val a = new A
        val b = new B
        
        a ^ b // a.^(b)
        a ^: b // b.^:(a)  因为是: 结尾的方法, 所以b是操作的目标
        
        
        Math.pow(2, _)
        
        foo(Array(10,20,30): _*)
        
    }
    // /:  :\ :: :::
    def foo(args: Int*) ={
    
    }
}

class A {
    def ^(b: B) = println("这是调用的 A 的方法")
    
    
    
}

class B {
    def ^:(a: A) = println("这是调用的 B 的方法")
}

