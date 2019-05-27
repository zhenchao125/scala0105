package com.atguigu.day05.matchdemo

/**
  * Author lzc
  * Date 2019-05-27 14:47
  */
object MatchType {
    def main(args: Array[String]): Unit = {
        val lisst1 = List("aaa", 12, true, 12.4, 10, "bbb")
        
        lisst1.foreach(x => {
            val r: Any = x match {
                case i: Int => i * i
                case s: String => s + "<<<"
                case _ =>
            }
            println(r)
        })
        
    }
}
