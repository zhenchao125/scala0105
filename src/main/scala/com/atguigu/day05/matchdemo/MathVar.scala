package com.atguigu.day05.matchdemo

object MathVar {
    def main(args: Array[String]): Unit = {
        val s = "asdf394792fjlsd$$33"
        // 数字变成平方  字符原封不动返回 其他的变成0
        s.foreach(c => {
            val r: Int = c match {
                case c if (c <= '9' && c >= '0') =>
                    (c - '0') * (c - '0')
                case c if (c <= 'z' && c >= 'a') =>
                    c
                case _ => 0
            }
            println(r)
        })
        
    }
}
