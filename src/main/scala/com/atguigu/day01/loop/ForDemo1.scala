package com.atguigu.day01.loop

/**
  * Author lzc
  * Date 2019-05-21 15:15
  */
object ForDemo1 {
    def main(args: Array[String]): Unit = {
        /*var s = "abcd"
        
        for (c <- s) {
            println(c)
        }*/
        
        /*for (i <- 1 to 100) {
            println(i)
        }*/
        
        /*for (i <- 1 to (100, 1) reverse ) {
            println(i)
        }*/
        
        /*for (elem <- 0 until 10) {
            println(elem)
        }*/
        
        // 守卫
        for (elem <- 1 to 100 if elem % 2 == 0) {
            
            println(elem)
        }
    }
}

/*
for 遍历
 */
