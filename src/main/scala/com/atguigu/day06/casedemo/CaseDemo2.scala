package com.atguigu.day06.casedemo

/**
  * Author lzc
  * Date 2019-05-28 10:13
  */
object CaseDemo2 {
    def main(args: Array[String]): Unit = {
        val arr = Array(Dollar(1000), Currency(10000, "RMB"))
    
        for (ele <- arr) {
            val res = ele match {
                case Dollar(v) => "$" + v
                case Currency(v, u) => v + u
                case _ => ""
            }
            println(res)
        }
    
    }
}

// 一个抽象类
abstract class Amount

// Dollar: 样例类 继承自 Amount
case class Dollar(value: Double) extends Amount

// Currency: 样例类
case class Currency(value: Double, unit: String) extends Amount
