package com.atguigu.day05.matchobj

/**
  * Author lzc
  * Date 2019-05-27 16:52
  */
object BigIntDemo {
    def main(args: Array[String]): Unit = {
        // BigInteger  +:plus -minus * /
        
        
        val bi1 = BigInt("33052384092384092384092384092")
        val bi2 = BigInt("330854050452384092384092384092384092")
        println(bi1 + bi2)
        val (s, m) = bi1 /% 10
        println(m)
        
    }
}
