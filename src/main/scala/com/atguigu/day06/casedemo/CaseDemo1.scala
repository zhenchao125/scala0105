package com.atguigu.day06.casedemo

/**
  * Author lzc
  * Date 2019-05-28 09:53
  */
object CaseDemo1 {
    def main(args: Array[String]): Unit = {
        val humans = List(Person("lis", 20), User("aa", 30))
        humans.foreach(human => {
            human match {
                case User(name, age) =>
                
                case Person(name, age) =>
                
            }
        })
    }
}

class Human

case class Person(var name: String, age: Int) extends Human

case class User(var name: String, age: Int) extends Human

/*
专为模式匹配而生:
    为了方便我们对象的匹配
    
    一般用于封装数据, 用来替换我们以前的javabean
    
   1. 样例类中所有的属性默认都是val的
 */
