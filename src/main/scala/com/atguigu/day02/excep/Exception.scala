package com.atguigu.day02.excep

import java.io.{FileInputStream, FileNotFoundException}

/**
  * Author lzc
  * Date 2019-05-22 10:21
  */
object Exception {
    def main(args: Array[String]): Unit = {
        val fis = try {
            new FileInputStream("c:/a.txt")
        } catch {
            // 模式匹配
            case e: FileNotFoundException =>
                new FileInputStream("c:/b.txt")
            
        } finally {
            1
        }
    }
}
