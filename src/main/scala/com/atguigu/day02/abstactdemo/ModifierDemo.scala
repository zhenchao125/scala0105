package com.atguigu.day02.abstactdemo

object ModifierDemo {
    def main(args: Array[String]): Unit = {
        val worder = new Worder
        worder.foo()
    }
}

class User{
    //
    protected[abstactdemo] def a = 10
    
    
}

class Worder {
    def foo() ={
//        println(super.a)
        val user = new User
//        println(user.a)
    }
}


/*
java中的修饰符:
    public 公共
    protected  父和继承类之间, 包内也可以
    默认(friendly, 包访问权限)
    private 私有
    
scala:
   
    默认都是public的
    private 类的内部可见(伴生对象也可见)
    protected
        父和继承类之间 (包内不变见)
        
     
    控制粒度更细:
    
        


 */