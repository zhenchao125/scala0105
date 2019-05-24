package com.atguigu.day03.obj

/**
  * Author lzc
  * Date 2019-05-24 10:31
  */
object EqualDelmo1 {
    def main(args: Array[String]): Unit = {
        val p1 = new Person("李四")
        val p2 = new Person("李四")
        println(p1 == p2)
        println(p1 eq p2)
    }
}

class Person(val name: String) {
    override def hashCode(): Int = name.hashCode
    
    override def equals(obj: scala.Any): Boolean = {
        println("equals...")
        val p = obj.asInstanceOf[Person]
        this.name.equals(p.name)
    }
}
