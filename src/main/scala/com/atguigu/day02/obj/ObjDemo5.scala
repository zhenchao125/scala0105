package com.atguigu.day02.obj

/**
  * Author lzc
  * Date 2019-05-22 14:09
  */
object ObjDemo5 {
    def main(args: Array[String]): Unit = {
    
        
    }
}


class Stu2(val name: String) {
    var age: Int = _ // age = 0
    var sex: String = _
}

/*
属性能不能交给scala自动给我们初始化呢?

数字: 0
布尔值: false
引用类型: null

数据类型不能推导:
    1. 递归函数的返回值不能推
    2. 给属性使用默认值的是不能推
    3. 当推导类型和你的预期不一致的时候不能推
    4. 如果使用return语句, 则函数的返回值不能推


_:
    1. 导包的时候的通配符  (java: *)
    2. 拆集合  _*
    3. 给属性默认初始化
 */
