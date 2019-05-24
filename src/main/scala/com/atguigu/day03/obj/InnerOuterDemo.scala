package com.atguigu.day03.obj

/**
  * Author lzc
  * Date 2019-05-24 14:00
  */
object InnerOuterDemo {
    def main(args: Array[String]): Unit = {
        val out1 = new Outer
        val inner1 = new out1.Inner
        val out2 = new Outer
        val inner2 = new out2.Inner
        
        inner1.foo(inner1)
        inner1.foo(inner2)
       
    }
}


class Outer {
    
    var a = 10
    
    class Inner {
        var a = 20
        // 类型投影
        def foo(i: Outer#Inner) = {
            //            println(this.a)
            //            println(Outer.this.a)
            println(i.a)
        }
    }
    
}
