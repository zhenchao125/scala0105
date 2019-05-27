package com.atguigu.day05.matchdemo

object TupleDemo1 {
    def main(args: Array[String]): Unit = {
        val t:Any = (1, "a")
        
        t match {
            case (a, _, _) => println(a)
        }
        
    }
}
