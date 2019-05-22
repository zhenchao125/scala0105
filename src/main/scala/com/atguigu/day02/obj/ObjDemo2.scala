package com.atguigu.day02.obj

import scala.beans.BeanProperty

/**
  * Author lzc
  * Date 2019-05-22 11:11
  */
object ObjDemo2 {
    def main(args: Array[String]): Unit = {
        val user = new User()
//        println(user.toString)
        println(user.name)
        user.age = 100
//        println(user.age)
        println(user.getAge())
        println(user.age)
        user.eat()
    }
}

class User{
    @BeanProperty
    val name = "Lisi"
    @BeanProperty
    var age = 10
    
    def eat() ={
        println("eat...")
    }
}


/*
一个scala文件能定义多个类, 而且实际开发时. 通常也是会定义多个类
所有的类都是public的

@BeanProperty  为了生成标准javaben setter和getter
 */
