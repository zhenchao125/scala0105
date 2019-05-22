package com.atguigu.day02.obj

/**
  * Author lzc
  * Date 2019-05-22 14:09
  */
object ObjDemo4 {
    def main(args: Array[String]): Unit = {
        val lisi = new Stu1(20, "zs")
        println(lisi.name)
        
    }
}


class Stu1(val name: String) {
    
    def this(age: Int, name: String) {
        this(name)
        println(age)
    }
    
    def this() {
        this(20, "aaa")
    }
    
}

/*
1. 辅助构造函数的名是 this, 而且他的首行代码必须是调用主构造
2. 辅助构造函数只能调用他前面的辅助构造函数
3. 只有主构造的形参才会自动成为类的属性, 而且这些形参可以在类的内部的任意地方使用.
    辅助构造函数的形参仅仅是一个普通的常量
*/