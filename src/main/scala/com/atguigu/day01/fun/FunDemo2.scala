package com.atguigu.day01.fun

/**
  * Author lzc
  * Date 2019-05-21 16:51
  */
object FunDemo2 {
    def main(args: Array[String]): Unit = {
        println(add4(4, 3))
    }
    
    def add(a: Int, b: Int): Int = {
        a + b
    }
    
    def add1(a: Int, b: Int) = {
        a + b
    }
    
    def add2(a: Int, b: Int) = {
         a + b
    }
    
    def add3(a: Int, b: Int): Unit = {
         a + b
    }
    
    def add4(a: Int, b: Int) {
        a + b
        return 10
    }
}

/*
定义函数:
    
    def 函数名(a: Int, b: Int, ...) : 返回值的类型 = {
        // 函数体
    }

1. 函数内的最后一行代码的值, 会自动返回
2. 返回值类型可以省略, 让scala根据最后一行代码的类型自动推导
3. 如果想用return, 则不能使用推导
4. 如果返回值类型明确的写成了Unit, 则不管内部怎么写, 返回一定永远是 Unit
5. 如果省略了 = , 也是永远返回 Unit, 添加return,  也是返回Unit


重点:
1. 函数声明
2. 返回值类型可以推导
3. 最后一行代码自动返回
 */