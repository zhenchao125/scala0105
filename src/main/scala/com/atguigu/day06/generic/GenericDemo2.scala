package com.atguigu.day06.generic

object GenericDemo2 {
    def main(args: Array[String]): Unit = {
//        println(max(1, 2))
//        println(max("a", "b"))

//        println(max1(1, 2))
        println(max1(new User(10), new User(20)))
    }
    
    def max1[T <: Ordered[T]](a:T, b: T) ={
        if(a > b) a else b
    }
    
    def max[T <: Comparable[T]](a:T, b: T) ={
        if(a.compareTo(b) > 0) a else b
    }
}


class User(val age: Int) extends Ordered[User] {
    override def compare(that: User): Int = this.age - that.age
    
    override def toString = s"User($age)"
}