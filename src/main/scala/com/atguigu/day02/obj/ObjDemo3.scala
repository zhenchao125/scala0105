package com.atguigu.day02.obj

import scala.beans.BeanProperty

object ObjDemo3 {
    def main(args: Array[String]): Unit = {
        val p = new Person("lisi", 20, "男")
        /*println(p.name)
        println(p.age)
        println(p.county)*/
        
    }
}

class Stu(var name: String)

class Person(@BeanProperty val name: String, var age: Int, sex: String) {
    val county: String = "zg"
    println("aaa")
    def eat = {
        println(this.sex)
        println(sex)
    }
    
}

/*
主构造
    紧随类名来定义, 他的形参是可以作为类的属性来存在的
    
    将来创建对象的时候一定是先调用主构造函数


辅构造
 */
