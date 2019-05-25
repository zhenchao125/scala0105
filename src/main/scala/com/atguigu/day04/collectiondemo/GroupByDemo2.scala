package com.atguigu.day04.collectiondemo

object GroupByDemo2 {
    def main(args: Array[String]): Unit = {
        val list = List(("a", 4), ("b", 3), ("a", 3), ("b", 3), ("c", 3))
        
        val map1: Map[String, List[(String, Int)]] = list.groupBy(t => t._1)
        val r: Map[String, Int] = map1.map(kv => {
            val k = kv._1
            val v: List[(String, Int)] = kv._2
            (k, v.foldLeft(0)(_ + _._2))
        })
        println(r)
    }
}
