package com.atguigu.day04.collectiondemo

object FoldLeftDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 30, 50, 70, 60, 10, 20, 30, 10, 10)
        val map: Map[Int, Int] = list1.foldLeft(Map[Int, Int]())((map, e) => {
            map + (e -> (map.getOrElse(e, 0) + 1))
        })
        println(map)
        
        
        //        val r: Int = list1.foldLeft(0)(_ + _)
        // 得到集合中的最大值
        /*val max = list1.foldLeft(Int.MinValue)((x, y) => {
//            if(x > y) x else y
            x.max(y)
        })*/
        
        // 305070...
        
        //        val r: String = list1.foldLeft("")((x, y) => x + y)
        
        // 放入Map:
        
    }
}
