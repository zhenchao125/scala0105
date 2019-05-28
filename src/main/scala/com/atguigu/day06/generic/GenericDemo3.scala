package com.atguigu.day06.generic

object GenericDemo3 {
    def main(args: Array[String]): Unit = {
        
        biophony(Seq(new Animal)).foreach(_.sound())
        biophony(Seq(new Earth)).foreach(_.sound())
//        biophony(Seq(new Object))
        biophony(Seq(new Bird)).foreach(_.sound())
        biophony(Seq(new Moon))
        
       List
        
    }
    
    def biophony[T >: Animal](things: Seq[T]) = things
}


class Earth { //Earth 类
    def sound() { //方法
        println("hello !")
    }
}

class Animal extends Earth {
    override def sound() = { //重写了Earth的方法sound()
        println("animal sound")
    }
}

class Bird extends Animal {
    override def sound() = { //将Animal的方法重写
        print("bird sounds")
    }
}

class Moon
