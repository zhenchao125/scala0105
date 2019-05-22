package com.atguigu.day02.abstactdemo

object AbstractDemo1 {
    def main(args: Array[String]): Unit = {
        val p: Person = new Person {
            override var n: Int = _
    
            override def a(): Int = {
                1
            }
        }
        
        
    }
}

abstract class Person {
    var n: Int
    
    
    def a(): Int
}

class Student extends Person {
    
    
    override def a(): Int = {
        1
    }
    
    override var n: Int = _
}

/*

抽象类:

    1. 可以有抽象方法, 还可以有抽象字段
        只有方法签名, 没有实现
        抽象字段: 只有声明, 没有初始化
    
    2. 不能直接创建对象, 只能通过他的实现类来创建对象
    

两同, 两小(同), 一大(同)
 1. 方法名相同, 参数类别相同
 2. 返回值类型不能大于父类的返回类型
    抛的异常要小
 3. 权限修饰符

*/
