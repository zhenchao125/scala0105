package com.atguigu.day03.arr

import scala.collection.mutable.ArrayBuffer

/**
  * Author lzc
  * Date 2019-05-24 16:44
  */
object ArrayBufferDemo2 {
    def main(args: Array[String]): Unit = {
        
        //        val buffer1 = ArrayBuffer(1, 2, 3, 4, 5)
        
        //        val b2: ArrayBuffer[Int] = buffer1 :+ 10
        //        println(100 +: buffer1)
        //        println(b2)
        val buffer1 = ArrayBuffer(1, 2, 3, 4, 5)
        val buffer2 = ArrayBuffer(10, 2, 3, 4, 5)
        
//        buffer1 ++= buffer2
        buffer1 ++=: buffer2
        println(buffer2)
        println(buffer1)
        
    }
}

/*
+=
+=:
-=

:+
+:

++
++=

++:
++=:


::
:::
:\
/:
 */