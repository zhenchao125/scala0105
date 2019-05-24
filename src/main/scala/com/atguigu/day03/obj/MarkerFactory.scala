package com.atguigu.day03.obj

import scala.collection.mutable

/**
  * Author lzc
  * Date 2019-05-24 09:26
  */
object Marker {
    def main(args: Array[String]): Unit = {
        println(Marker.getMarker("red"))
        println(Marker.getMarker("red"))
        println(Marker.getMarker("red"))
        println(Marker.getMarker("red"))
        println(Marker.getMarker("blue"))
        println(Marker.getMarker("yellow"))
        println(Marker.getMarker("yellow"))
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
class Marker private(val color: String) {
    println(s"create  $color  Marker")
    
    override def toString: String = color
    
    def say() ={
    
    }
}

/*
    https://github.com/zhenchao125/scala0105.git
    
java:
    静态和非静态成员
    
scala:
    没有静态和非静态之分了.
    
class Marker是 object Marker 的伴生类
object Marker是 class Marker 的伴生对象
 
 伴生类和伴生对象之间可以互相访问对的私有成员
 
    
 */

