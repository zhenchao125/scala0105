package com.atguigu.day05.homework

object Homework4 {
    implicit val sep = ","
    def main(args: Array[String]): Unit = {
        
        val list1 = List(30, 50, 70, 60, 10, 20)
        println(list1.myMakeString())
    }
    
    implicit class MyList(list: List[Int]) {
        def myMakeString(implicit sep: String = ",") = {
            list.foldLeft("")((x, y) => x + sep + y).substring(sep.length)
        }
    }
    
}

/*
4. 实现一个函数，作用与mkString相同，使用foldLeft
 */
