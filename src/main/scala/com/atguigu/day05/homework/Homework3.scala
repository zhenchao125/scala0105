package com.atguigu.day05.homework

import scala.collection.immutable

/**
  * Author lzc
  * Date 2019-05-27 08:12
  */
object Homework3 {
    def main(args: Array[String]): Unit = {
        indexes("Helloee")
    }
    
    def indexes(s: String) ={
        val charToIndexGouped: Map[Char, immutable.IndexedSeq[(Char, Int)]] = (0 until s.length).map(i => {
            (s(i), i)
        }).groupBy(x => x._1)
        
        val result = charToIndexGouped.map(kv => {
            kv._1 -> kv._2.map(_._2).toList
        })
        result
        println(result)
        
    }
}
/*

3. 编写一个函数, 接收一个字符串, 返回一个 Map.
     比如: indexes("Helloee")

    返回: Map(H->{0}, e -> {1, 5, 6}, ...)   数字其实是下标
    
   
    
 */