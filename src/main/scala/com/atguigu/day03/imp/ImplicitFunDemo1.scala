package com.atguigu.day03.imp

object ImplicitFunDemo1 {
    def main(args: Array[String]): Unit = {
        // 2 4 i18n
        implicit def double2Int(d: Double) = d.toInt
        // 自动的找一个隐式函数, 接收一个double类型的参数, 并发
        // 返回一个Int
        val a: Int = 10.1
        println(a)
    }
}

/*
1. 隐式函数
    使用 implicit 修饰, 并且直接收一个参数, 必须还有返回值


 */
