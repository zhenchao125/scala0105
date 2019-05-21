package com.atguigu.day01.typedemo

/**
  * Author lzc
  * Date 2019-05-21 11:39
  */
object StringDemo {
    def main(args: Array[String]): Unit = {
        val a = 10.447788;
        // 格式化输出
        //        printf("%.2f  %d", a, 10)
        
        // 字符插值
        val aa = 10
        val bb = "abc"
        
        //        println("aa = " + aa + ", " + "bb = " + bb)
        val cc = s"aa = ${aa + 10} , bb = $bb"
        println(cc)
        
        var id = 10
        // 原始字符串
        var s =
            s"""
               |select
               |    *
               |from user
               |where id=$id
            """.stripMargin
        println(s)
    }
}
