package com.atguigu.day06.generic

object GenericDemo6 {
    def main(args: Array[String]): Unit = {
        /*val stus: List[Stu] = List(new Stu, new Stu)
        val ps :List[Person] = stus
        
        val mylist = new MyList[Stu]
        val mylist2: MyList[Person] = mylist
        
        
        val arr1 = new MyArray[Person]
        var arr2 : MyArray[Stu] = arr1*/
        
        val listStu = new MyList[Stu]
        
        
    }
}

class MyArray[-T] {
    def foo[K <: T](a: T): K = {
        throw new RuntimeException
    }
}

class MyList[+T] {
    
    // 下界的用法
    def foo[K >: T](a: K) = {
    
    }
}

class Person

class Stu extends Person

/*
不变
    默认情况, java和scala都是 不变
    
协变:
    如果允许把子类型的集合赋值给父类型的集合  协变
    
    在定义泛型的时候, 泛型前面使用  [+A]
    
逆变
    如果允许把父类型的集合赋值给子类型的集合  逆变
        [-A]

 */