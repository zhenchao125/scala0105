package com.atguigu.day03.arr

/**
  * Author lzc
  * Date 2019-05-24 16:33
  */
object ArrayDemo1 {
    def main(args: Array[String]): Unit = {
        val arr = Array[Int](1, 2, 3, 4, 5)
        println(arr(0))
        arr(0) = 100
        println(arr(0))
        for (i <- 0 until arr.length) {
            println(arr(i))
        }
    
        for (elem <- arr) {
            println(elem)
        }
    }
}

/*
原生的支持操作 xml 标签  <a>
0. <> 支持xml
1. []表示泛型
2. 下标用圆括号


user("name")

 */