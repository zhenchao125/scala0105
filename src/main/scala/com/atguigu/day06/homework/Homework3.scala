package com.atguigu.day06.homework

/**
  * Author lzc
  * Date 2019-05-28 07:58
  */
object Homework3 {
    def main(args: Array[String]): Unit = {
        // reduce foldLeft
        val list = List(Some(10), Some(20), None, Some(3))
    
//        println(list.foldLeft(0)((x, y) => x + y.getOrElse(0)))
        println(sum(list))
        
    }
    
    def sum(list: List[Option[Int]]) ={
        /*val list2: List[Int] = list.map(x => {
            x match {
                case Some(v) => v
                case None => 0
            }
        })*/
        
//        list2.reduce(_ + _)
        
        list.map{
            case Some(v) => v
            case None => 0
        }.reduce(_ + _)
    }
}
/*
3. 编写一个函数，计算List[Option[Int]] 中所有非None值之和。
分别使用 match 和不使用用match来计算
 */