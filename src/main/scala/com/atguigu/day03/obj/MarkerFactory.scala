package com.atguigu.day03.obj

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019-05-24 09:26
  */
object MarkerFactory {
    def main(args: Array[String]): Unit = {
        println(MarkerFactory.getMarker("red"))
        println(MarkerFactory.getMarker("red"))
        println(MarkerFactory.getMarker("red"))
        println(MarkerFactory.getMarker("red"))
        println(MarkerFactory.getMarker("blue"))
        println(MarkerFactory.getMarker("yellow"))
        println(MarkerFactory.getMarker("yellow"))
    }
    
    // Map 字典
    val markers = mutable.Map(
        "red" -> new Marker("red"),
        "blue" -> new Marker("blue"),
        "green" -> new Marker("green")
    )
    
    def getMarker(color: String): Marker = {
//        markers.getOrElse(color, new Marker(color))
        markers.getOrElseUpdate(color, new Marker(color))
    }
    
}

// 构造函数私有化之后, 只能在类的内部和  ....
class Marker  private (val color: String) {
    println(s"create  $color  Marker")
    override def toString: String = color
}
