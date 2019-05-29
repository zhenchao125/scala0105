package com.atguigu.day07.homework

object Homework2 {
    def main(args: Array[String]): Unit = {
        println(change(5, Array(1, 2)))
    }
    
    def change(money: Int, coins: Array[Int]): Int = {
        if (money == 0) 1
        else if (money < 0 || coins.length == 0) 0
        else change(money, coins.tail) + change(money - coins.head, coins)
    }
}

/*
2. 大公司面试题: 使用递归(不用尾递归)
   假设某国的货币有若干面值，现给一张大面值的货币要兑换成零钱，问有多少种兑换方式
   
 递归算法:
 
 1. 找到递归算法
 
    11  1,2,5,10
    不包含第一种货币的换发 + 包含第一种货币的换法
    change(money, arr.tail)
    
    change(money, coins)  === change(money - coins.head, coins)
    
    
 
 2. 还需要找到递归的结束条件
 
    1.
        如果你要换的钱是0, 我认为是有 1 种换法
        
    2. 如果你的钱数是负数, 或者零钱数组长度是0
        换法是 0 种
 
 */
