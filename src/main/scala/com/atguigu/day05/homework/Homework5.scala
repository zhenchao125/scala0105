package com.atguigu.day05.homework

import scala.io.Source

object Homework5 {
    def main(args: Array[String]): Unit = {
        var filePath = "C:\\Users\\lzc\\Desktop\\class_code\\2019_01_05\\01_scala\\scala0105\\src\\main\\scala\\com\\atguigu\\day05\\homework\\Homework4.scala"
        //        Source.fromFile(filePath).mkString.split("\\W").
        val it = Source.fromFile(filePath).getLines().flatMap(line => line.split("\\W")).toList
        val groupedMap: Map[String, List[String]] = it.groupBy(x => x).filter(_._1.length > 1)
        //        val result: Map[String, Int] = groupedMap.map(kv => (kv._1, kv._2.length))
        val result: Map[String, Int] = groupedMap.map(kv => kv._1 -> kv._2.length)
        println(result)
        
    }
}

/*
5. 实现一个 scala 版的 wordcount
    读取文件, 然后实现
    Source.
 */