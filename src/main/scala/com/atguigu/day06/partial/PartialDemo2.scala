package com.atguigu.day06.partial

import scala.io.Source

object PartialDemo2 {
    def main(args: Array[String]): Unit = {
        val path = "C:\\Users\\lzc\\Desktop\\class_code\\2019_01_05\\01_scala\\scala0105\\src\\main\\scala\\com\\atguigu\\day06\\homework\\Homework1.scala"
        val list: List[(String, List[String])] = Source.fromFile(path).getLines()
            .flatMap(_.split("\\W+"))
            .toList.groupBy(x => x)
            .toList
    
        val tuples: List[(String, Int)] = list.map{
            case (word, wordList) => {
                (word, wordList.size)
            }
        }
        println(tuples)
        
    }
}
