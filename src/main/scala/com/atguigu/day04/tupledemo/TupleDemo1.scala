package com.atguigu.day04.tupledemo

/**
  * Author lzc
  * Date 2019-05-25 09:17
  */
object TupleDemo1 {
    def main(args: Array[String]): Unit = {
        /*val t2 = Tuple2(1, "abc")
        println(t2._1)
        println(t2._2)
        
        for(i <- t2.productIterator){
            println(i)
        }*/
        
        var t2 = (1, "ac")
    
        val (s, _) = /%(10, 3)
        println(s)
        
        val t22 = ("a", ("b", 1))
        println(t22._2._2)
        
        // Tuple2 对偶
        
    }
    
    
    def /%(m: Int, n: Int) = {
        (m / n, m % n)
    }
}
