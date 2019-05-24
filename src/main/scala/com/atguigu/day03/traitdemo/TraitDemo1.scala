package com.atguigu.day03.traitdemo

/**
  * Author lzc
  * Date 2019-05-24 10:38
  */
object TraitDemo1 {
    def main(args: Array[String]): Unit = {
        val usb:Usb = new HuaweiUsb
        usb.insert()
        usb.remove()
        
    }
}

trait Usb{
    def insert(): Unit
    def remove(): Unit
}

trait Typec{
    def getType: String
    def setType(t: String): Unit
}


class HuaweiUsb extends Usb with Typec with Serializable {
    override def insert(): Unit = {
        println("插入华为usb")
    }
    
    override def remove(): Unit = {
        println("移除华为usb")
    }
    
    var t :String = _
    override def getType: String = t
    override def setType(t: String): Unit = this.t = t
}



/*
trait:
   特质  对应着java中的接口
   
   能够拥有的成员来, 和抽象一样
   
   可以多混入(with)
   
1. 作用接口使用trait
   
java 中的接口:
    抽象方法, 常量(1.7之前)
        抽象方法和常量的集合
    默认方法(1.8...)
    
    实现
 */
