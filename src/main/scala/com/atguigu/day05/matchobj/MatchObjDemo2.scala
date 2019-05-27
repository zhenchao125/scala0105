package com.atguigu.day05.matchobj

object MatchObjDemo2 {
    def main(args: Array[String]): Unit = {
        -9.0 match {
            case Square1(s) => println(s)
            case _ => println("aaa")
        }
    }
}

object Square1 {
    // 给一个数, 提前他的平方根
    def unapply(n: Double): User = {
        new User(n)
    }
}

class User(d: Double) {
    // 小于等于 0 表示没有平方
    def isEmpty = d < 0
    
    def get = math.sqrt(d)
}
/*
对象匹配:
    对象提取器
  
提取的器返回值必须是 Option 类型:
      
      Option:  Some None
      
 

    
 */
