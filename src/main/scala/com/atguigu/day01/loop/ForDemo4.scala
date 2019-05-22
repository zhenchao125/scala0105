package com.atguigu.day01.loop

import scala.util.control.Breaks.breakable
import scala.util.control.Breaks.break

/**
  * Author lzc
  * Date 2019-05-21 15:58
  */
object ForDemo4 {
    def main(args: Array[String]): Unit = {
        /*for (i <- 1 to 10 if i <= 5) {
            println(i)
        }*/
        // 正统
        breakable {
            for (i <- 1 to 10) {
                if (i == 5) break;
                println(i)
            }
        }
        
        println("aaa")
        
        
    }
}
