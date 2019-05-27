package com.atguigu.day05.matchobj

object MatchObjDemo3 {
    def main(args: Array[String]): Unit = {
        var s = "lisi,zhangsan,wangwu,zhaoliu"
        s match {
            case Names(one, two, _*) => println(one, two)
        }
    }
}


object Names {
    def unapplySeq(s: String) = {
        Some(s.split(","))
    }
    
    
}
