package com.atguigu.day06.enumdemo

object EnumerationDemo {
    def main(args: Array[String]): Unit = {
        WeekDay.Mon
    }
}

object WeekDay extends Enumeration {
    type WeekDay = Value
    val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
}