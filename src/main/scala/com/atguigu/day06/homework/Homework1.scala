package com.atguigu.day06.homework

import scala.io.Source

object Homework1 {
    def main(args: Array[String]): Unit = {
        val path = "C:\\Users\\lzc\\Desktop\\class_code\\2019_01_05\\01_scala\\scala0105\\src\\main\\scala\\com\\atguigu\\day06\\homework\\Homework1.scala"
        val wordCountMap: Map[String, Int] = Source.fromFile(path).getLines()
            .flatMap(_.split("\\W+"))
            .filter(_.length > 0)
            .toList.groupBy(word => word) // hello List("")
            .map(word2List => (word2List._1, word2List._2.size))
        val workCountList: List[(String, Int)] = wordCountMap.toList
        val wordCountSorted: List[(String, Int)] = workCountList
            //            .sortBy(x => (x._2, x._1.length))(Ordering.Tuple2(Ordering.Int.reverse, Ordering.Int))
            .sortBy {
            case (word, count) => (count, word.length)
        }(Ordering.Tuple2(Ordering.Int.reverse, Ordering.Int))
            .take(3)
        
        println(wordCountSorted)
        
        
    }
}

/*
1. 对前面 wordcount 的结果, 按照单例的个数降序排列,如果个数相同按照单词的长度升序排列
 */