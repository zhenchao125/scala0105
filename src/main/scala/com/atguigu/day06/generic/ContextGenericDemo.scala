package com.atguigu.day06.generic

object ContextGenericDemo {
    def main(args: Array[String]): Unit = {
        println(max(1, 2))
//        println(max(User(10), User(20)))
        
    }
    
   /* def max[T: Ordering](a: T, b: T)(implicit ord: Ordering[T]) = {
        if (ord.gt(a, b)) a else b
    }*/
    
    def max[T: Ordering](a: T, b: T) = {
        
        val ord = implicitly[Ordering[T]]
        if (ord.gt(a, b)) a else b
    }
    
}
case class User(age: Int)

/*
上下文界定:
    [T:M]
    必须有一个隐式值 M[T]
    
    [T: Ordering]
    必须有一个隐式值:  Ordering[Int]


1. 上界和下界
2. 视图界定

 */
