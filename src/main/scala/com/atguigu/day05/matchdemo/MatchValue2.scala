package com.atguigu.day05.matchdemo

/**
  * Author lzc
  * Date 2019-05-27 14:17
  */
object MatchValue2 {
    def main(args: Array[String]): Unit = {
        val Aa = 1
        
        val ch:Any = 10
        
        ch match {
            case "aaa" => println("aaa")
            case Aa => println(Aa)
            
            //            case a => println(a)
            case _ => println("_")
        }
    }
    
}
