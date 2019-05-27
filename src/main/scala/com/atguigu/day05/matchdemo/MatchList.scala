package com.atguigu.day05.matchdemo

/**
  * Author lzc
  * Date 2019-05-27 15:37
  */
object MatchList {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70)
        list1 match {
            //            case List(a, b, c) => println(a, b, c)
            //            case List(a, 50, c) => println(a, c)
            //            case a :: b :: c :: Nil => println(a)
            //            case List(a, rest@_*) => println(a, rest)
            //            case a :: rest => println(a, rest)
            case a :: _ => println(a)
        }
    }
}
