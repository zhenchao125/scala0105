package com.atguigu.day04.high

/**
  * Author lzc
  * Date 2019-05-25 14:40
  */
object PartiDemo1 {
    def main(args: Array[String]): Unit = {
        val pow2: Double => Double = Math.pow(2, _)
    
        println(pow2(3))
        println(pow2(4))
        println(pow2(5))
        
        val pow31: Double => Double = Math.pow(_, 1.0 / 3)
        println(pow31(27))
    }
}

/*


*/