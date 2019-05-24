package com.atguigu.day03.arr

import scala.collection.mutable.ArrayBuffer

/**
  * Author lzc
  * Date 2019-05-24 16:44
  */
object ArrayBufferDemo1 {
    def main(args: Array[String]): Unit = {
        
        val buffer = ArrayBuffer(1, 2, 1, 3, 4, 5)
        /*buffer.append(10, 20, 30)
        buffer.prepend(-1,-2)
        buffer.insert(1, 100, 200)*/
        buffer += (100, 200)
        100 +=: buffer
        
        buffer -= 1
        println(buffer)
        
        
        
    }
}

/*

+=

运算符的结合性:
    大部分都是左结合(从左向右)
    
    右结合:
       =
       
       约定:  只要运算符 用: 结尾,这样的运算符就是右结合
       
       前置运算符  ! ~ + -
       
    

 */