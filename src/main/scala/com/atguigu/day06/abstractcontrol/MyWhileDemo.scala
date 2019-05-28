package com.atguigu.day06.abstractcontrol

object MyWhileDemo {
    def main(args: Array[String]): Unit = {
        var a = 0
        mywhile(a < 10) {
            println(a)
            a += 1
        }
    }
    
    def mywhile(condition: => Boolean)(doSomething: => Unit): Unit = {
        if (condition) {
            doSomething
            mywhile(condition)(doSomething)
        }
    }
}
