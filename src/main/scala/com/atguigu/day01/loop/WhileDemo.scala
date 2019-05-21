package com.atguigu.day01.loop

/**
  * Author lzc
  * Date 2019-05-21 14:57
  */
object WhileDemo {
    def main(args: Array[String]): Unit = {
        var i = 1
        while (i < 101 ){
            println(i)
            i += 1
        }
    }
}

/*
java:
    for
    while
    do...while
    
scala:
    只有两种循环:
    1. while
    2. do...while
    
    scala中, for 不是循环, 而是在遍历一种"集合"

 */