package com.atguigu.day02.obj

object ObjDemo6 {
    def main(args: Array[String]): Unit = {
        // 给类起别名
        type Pt = PersonTeteteteChang
        println(classOf[PersonTeteteteChang].getSimpleName)  // PersonTeteteteChang.class
        println(classOf[Pt].getSimpleName)  // PersonTeteteteChang.class
        
        
        val pt = new Pt
        pt.eat()
        
    }
}

class PersonTeteteteChang{
    def eat()={
        println("eat....")
    }
}
