package com.atguigu.day03.imp

import java.io.File

import scala.io.Source

/**
  * Author lzc
  * Date 2019-05-24 14:30
  */
object RichFileDemo {
    def main(args: Array[String]): Unit = {
        implicit def  file2RichFile(file: File): RichFile = new RichFile(file)
        
        val content: String = new File("C:\\Users\\lzc\\Desktop\\class_code\\2019_01_05\\01_scala\\scala0105\\src\\main\\scala\\com\\atguigu\\day03\\imp\\RichFileDemo.scala").readContent
        println(content)
    }
}

class RichFile(file: File){
    def readContent = {
        Source.fromFile(file).mkString
    }
}


/*
1. io流
    读取文件内容
2. File
    文件的元数据


 */
