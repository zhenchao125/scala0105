package com.atguigu.day01.loop

/**
  * Author lzc
  * Date 2019-05-21 15:15
  */
object ForDemo2 {
    def main(args: Array[String]): Unit = {
        /*for (i <- 1 to 10; j = 10; k = 20) {
            // 噪声
            
        }*/
        
        // 循环的嵌套  99乘法表
        for (i <- 1 to 9) {
            for (j <- 1 to i) {
                print(s"$j * $i = ${j * i}\t")
            }
            println
        }
       
        // 里面的代码都数据循环最内层
        for(i <- 1 to 9; j <- 1 to i){
            print(s"$j * $i = ${j * i}\t")
            if(i == j) println()
        }
        
        
        
        
    }
}

/*
for 遍历
 */
