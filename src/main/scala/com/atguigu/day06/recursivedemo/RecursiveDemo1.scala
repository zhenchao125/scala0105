package com.atguigu.day06.recursivedemo

import scala.annotation.tailrec

object RecursiveDemo1 {
    def main(args: Array[String]): Unit = {
//        println(sum1(1, 10000, 0))
//        println(sum(1, 10000))
        println(reverse("abcefgh", ""))
        
    }
    // abc ""     bc  "a"   c  "ba"   ""
    def reverse(s: String, acc: String): String ={
        if(s.length == 0) acc
        else reverse(s.tail, s.head + acc)  //
    }
    @tailrec
    def sum1(from: BigInt, to: BigInt, acc: BigInt): BigInt ={
        if(from == to) acc + from
        else sum1(from + 1, to, from + acc)
    }
    
    def sum(from: BigInt, to: BigInt): BigInt = {
        if(from == to) /*from*/ throw new RuntimeException
        else from + sum(from + 1, to)
    }
}
