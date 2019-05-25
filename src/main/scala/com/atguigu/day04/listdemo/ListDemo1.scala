package com.atguigu.day04.listdemo

/**
  * Author lzc
  * Date 2019-05-25 09:49
  */
object ListDemo1 {
    def main(args: Array[String]): Unit = {
//        val list1 = List(30, 50, 70, 60, 10, 20)
//                val list2 = List(3, 5, 7, 6, 1, 2)
        //        val list3: List[Int] = list1 ++ list2
        //        println(list3)
        
        //        println(100 +: list1)
//        println(100 :: list1)
//        println(list1 ::: list2)
        
        
        var list1 = List(30, 50, 70, 60, 10, 20)
        var list2 = list1
        list2 :+= 100
        println(list1)
        println(list2)
        
        
        val s = "a"
        println(s.hashCode)
        println(System.identityHashCode(s))
    }
}

/*
List 列表

专门用到List的符号:
    :: 拼一个元素
    ::: 拼接 两个List
    
:+=
+=:
    ...
不可变和可变都可用

区别: 可变的是修改原集合
     不可变是创建一个新的的集合, 然后修改变量的引用

 */