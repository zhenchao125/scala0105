package com.atguigu.day06.abstractcontrol

object ControlDemo2 {
    def main(args: Array[String]): Unit = {
        //定义一个函数:  在子线程中执行一段代码
        runInThread{
            println("aaa")
            println("bbb")
            println(Thread.currentThread().getName)
        }
    }
    
    def runInThread(code: => Unit) = {
        new Thread() {
            override def run(): Unit = code
        }.start()
    }
    
}

/*
值调用:
    调用函数的时候, 是直接传递计算好的是过去
名调用:
    并不会直接传递值过去, 而是传递一个表达式, 函数内什么实用什么时候去计算




var a = 0
mywhile(a <= 10){
    println(a)
    a += 1
}

 */