package com.atguigu.day01.loop

/**
  * Author lzc
  * Date 2019-05-21 15:15
  */
object ForDemo3 {
    def main(args: Array[String]): Unit = {
        /*var i = 1
        val result = while (i <= 5) {
            println(i)
            i += 1
            i
        }
        println(result)*/
        
        // for 推导式
        var result = for (elem <- 1 to 10)
            yield elem * elem
        
        println(result)
        
    }
}

/*

while的返回值没有用, 因为是 Unit

 */
