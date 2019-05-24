package com.atguigu.day03.traitdemo

trait Logger extends Exception{
    
    def printError = {
        printStackTrace()
    }
}
/*trait Logger {
    // 指定自身类型
    //
    this: Exception =>
    
    def printError = {
        printStackTrace()
    }
}*/

class ConsoleLogger extends Exception with Logger


class A

object Demo1 {
    def main(args: Array[String]): Unit = {
        val logger = new ConsoleLogger
        logger.printError
    }
}

/*
1. trait 继承类

2. 自身类型

 */