package com.atguigu.day03.imp

import java.time.LocalDate

/**
  * Author lzc
  * Date 2019-05-24 14:52
  */
object RichDateDemo {
    def main(args: Array[String]): Unit = {
        val ago = "ago"
        val later = "later"
        
        implicit def int2RichDate(day: Int) = new RichDate(day)
        //
        println(2 days ago) // 2019-05-22
        println(2 days later) // 2019-05-26
        
    }
}

class RichDate(day: Int) {
    def days(when: String) = {
        val now: LocalDate = LocalDate.now()
        if (when == "ago") {
            now.minusDays(day).toString
        } else {
            now.plusDays(day).toString
        }
    }
}
/*
java.lang.
scala..
PreDef


1. 隐式函数

2. 隐式类
    是对隐式函数的简化

 */