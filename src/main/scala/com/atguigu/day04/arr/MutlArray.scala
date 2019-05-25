package com.atguigu.day04.arr

/**
  * Author lzc
  * Date 2019-05-25 08:56
  */
object MutlArray {
    def main(args: Array[String]): Unit = {
//        val arr: Array[Array[Int]] = Array.ofDim[Int](2, 3)
//        println(arr(0)(0))
        val arr = Array(Array(1, 2), Array(2,3,4))
        for(a <- arr; e <- a){
            println(e)
        }
    }
}
