package com.atguigu.day04.listdemo

object ListDemo2 {
    def main(args: Array[String]): Unit = {
        val list1: List[Int] = 2 :: 1 :: Nil
        val list2: List[Int] = list1 :+ 1
        println(list2)
    }
}
