package com.atguigu.day03.homework

object Homework3 {
    def main(args: Array[String]): Unit = {
    
    }
}

class Point(val x: Double, val y: Double) {
    def distance(other: Point) = {
        //this other
        math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y - other.y) * (this.y - other.y))
    }
}

class LabeledPoint(val label: String, override val x: Double, override val y: Double) extends Point(x, y)

/*
4. 设计一个Point类，其x和y坐标可以通过构造器提供。
     提供一个子类LabeledPoint，其构造器接受一个标签值和x,y坐标,
     比如:new LabeledPoint(“Black Thursday”,1929,230.07)

 */