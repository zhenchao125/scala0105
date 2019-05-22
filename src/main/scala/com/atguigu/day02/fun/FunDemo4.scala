package com.atguigu.day02.fun

/**
  * Author lzc
  * Date 2019-05-22 09:26
  */
object FunDemo4 {
    def main(args: Array[String]): Unit = {
        println(jiecheng(5))
    }
    
    def jiecheng(n: Int): Int ={
        if(n == 1){
            1
        }else{
            n * jiecheng(n - 1)
        }
    }
}
/*
递归函数的返回值类型不能推导
 */