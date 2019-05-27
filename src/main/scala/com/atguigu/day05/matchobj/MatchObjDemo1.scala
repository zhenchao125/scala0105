package com.atguigu.day05.matchobj

object MatchObjDemo1 {
    def main(args: Array[String]): Unit = {
        -9.0 match {
            case Square(s) => println(s)
            case _ => println("aaa")
        }
    }
}

object Square {
    // 给一个数, 提前他的平方根
    def unapply(n: Double): Option[Double] = {
        if (n >= 0) Some(math.sqrt(n))
        else None
    }
}

/*
对象匹配:
    对象提取器
  
提取的器返回值必须是 Option 类型:
      
      Option

    
 */
