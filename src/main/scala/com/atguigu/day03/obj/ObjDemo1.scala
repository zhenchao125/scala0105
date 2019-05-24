package com.atguigu.day03.obj

/**
  * Author lzc
  * Date 2019-05-24 10:14
  */
object ObjDemo1 {
    def main(args: Array[String]): Unit = {
        //        val user = User.apply("李四")
        val lisi = User("lisi")
        //        println(lisi.name)
        val propName = "name"
        println(lisi("name"))
    }
}

object User {
    def apply(name: String) = {
        println("apply....")
        new User(name)
    }
}


class User(val name: String) {
    def apply(propName: String) = {
        if (propName == "name") {
            this.name
        } else {
            "aaaa"
        }
    }
}


/*
伴生对象的作用:
    1. 增加java中的静态成员
    2. 可以不使用new来创建对象
        apply
        
 apply:
  1. 用在伴生对象中, 一般用来返回伴生类的对象
  
  2. 伴生类中也可以有apply
    将来通过 对象(...)  会自动调用类中的apply方法


== 在scala中他的效果和equals完全一样!!!

eq() 等价于java中的 ==
 */
