package com.atguigu.day03.homework

object Homework1 {
    def main(args: Array[String]): Unit = {
        val card = new card("♣")
        println(card.isRed)
    }
}

class card(val color: String) {
    override def toString: String = this.color
    
    def isRed = {
        if (color == "♦" || color == "♥") true
        else false
    }
}


/*
2. 编写一个扑克牌只能有 4 种花色,让其 toString 方法分别返回♣,♦,♥,♠，
并实现一个函数,检查某张牌的花色是否为红色



 */