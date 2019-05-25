package com.atguigu.day04.collectiondemo

object GroupByDemo {
    def main(args: Array[String]): Unit = {
        val lines = List("hello wold", "hello atguigu atguigu", "hao are you")
        // (hello,1),(world,1)....
        val list2 = lines.flatMap(x => x.split(" ")).map((_, 1))
    
        val map: Map[String, List[(String, Int)]] = list2.groupBy(t => {
            t._1
        })
        val r: Map[String, Int] = map.map(kv => {
            (kv._1, kv._2.size)
        })
        println(r)
//        val list1 = List(30, 5, 7, 60, 1, 20)
        
//        val map: Map[String, List[Int]] = list1.groupBy(x => if(x % 2 == 0) "偶数" else "奇数")
//        println(map)
        
        
    }
}
