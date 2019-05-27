package com.atguigu.day05.matchdemo

/**
  * Author lzc
  * Date 2019-05-27 14:56
  */
object MatchType2 {
    def main(args: Array[String]): Unit = {
        
        //        val t: Any = Array("1", "2")
        //        val t: Any = List(1, 2, "aaa")
        //        val t: Any =Map(1 -> "a")
        val t: Any = ("", "a")
        t match {
            //            case arr: Array[Int] => println("Array[Int]")
            //            case arr: Array[String] => println("Array[String]" + arr.mkString(", "))
            //            case list: List[_] => println("List[_]")
            //            case map:Map[_, _] => println("Map")
            case t1: (_, _) => println(t1)
        }
    }
}


/*
泛型擦除
    任何泛型类, 编译成字节码之后只有一份


 */