package com.atguigu.day02.ext

/**
  * Author lzc
  * Date 2019-05-22 15:25
  */
object ExtendsDemo {
    def main(args: Array[String]): Unit = {
        /* val son: Father = new Son
         // 判断类型
         println(son.isInstanceOf[Son])
         println(son.isInstanceOf[Father])
         println(son.isInstanceOf[AnyRef])
         println(son.isInstanceOf[Any])
         
         // 强制类型的转换
         println(son.asInstanceOf[Son])
     
         println(1.1.asInstanceOf[Int])*/
        
        val son = new Son(10)
        println(son.name)
        
        
    }
}


class Father(val name: String) {
    def this(age : Int){
        this("abc")
        println("Father 辅构造")
    }
    
    println("Father 主构造")
}

class Son(val age: Int) extends Father(age) {
    println("son 主构造")
    
}

/*
单继承


    静态代码块
    构造方法
java中的构造函数的调用顺序:
    父的静态代码块
    子的静态代码块
    父的构造代码块
    父的构造函数
    子的构造代码块
    子的构造函数
  
 scala:
    父的主构造
    子的主构造
    子的辅构造
    
    只有主构造才有机会调用到父类的构造函数
    
 */
