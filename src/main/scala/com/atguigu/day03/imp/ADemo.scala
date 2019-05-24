package com.atguigu.day03.imp

/**
  * Author lzc
  * Date 2019-05-24 15:32
  */
object B {
}

object A {
    implicit def b2a(b: B) = new A()
    
}

class A {
    
    def afoo() = {
        println("afoo")
    }
}

class B {
    
    def bfoo() = {
        println("bfoo")
        
    }
}

object ADemo {
    
    
    def main(args: Array[String]): Unit = {
        // 接收b类型的对象, 返回一个对象, 这个对象应用有一个方法 afoo()
//        new B().afoo()
        
        val a: A = new B()
        a.afoo()
    
        val set = Set(10, 20, 30)
    }
}



