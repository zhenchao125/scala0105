package com.atguigu.day02.ext

/**
  * Author lzc
  * Date 2019-05-22 15:42
  */
object ExtendsDemo2 {
    def main(args: Array[String]): Unit = {
//        val student = new Student
//        println(student.a)
//        println(student.b)
//        println(student.c)
        
        val p: Person = new Student
        val s :Student = p.asInstanceOf[Student]
    
        println(p.a)
        println(s.a)
    }
}

class Person {
    val a: Int = 20
    var b: Int = 200
    
    def eat() = {
    
    }
    
    def c = 10
}

class Student extends Person {
    override val a: Int = 30
//    override var b: Int = 300
    
    override val c = 0
    
    
    // 覆写时强制添加override关键字
    /*override def eat()={
    
    }*/
    
}

/*
在scala中, 字段(属性)也可以继承和覆写

1. val可以覆写val,  val可以覆写父类中  没有参数并且没有()的def

2. var 只能覆写父类的抽象的var
 */
