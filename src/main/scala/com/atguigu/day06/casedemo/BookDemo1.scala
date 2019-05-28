package com.atguigu.day06.casedemo

object BookDemo1 {
    def main(args: Array[String]): Unit = {
        val boo1 = Book("九阴真经", 100)
        val boo2 = Book("葵花宝典", 200)
        val bundle1 = Bundle("打包", 20, boo1, boo2)
        val bundle2 = Bundle("打包", 20, boo1, boo2, bundle1)
    
        println(price(boo1))
        println(price(boo2))
        println(price(bundle1))
        println(price2(bundle2))
    }
    
    
    def price(item: Item): Double = {
        item match {
            case Book(_, price) => price
            case Bundle(_, discount, items@_*) => {
                items.foldLeft(-discount)((m, item) => {
                    m + price(item)
                })
            }
        }
    }
    
    def price2(item: Item): Double = {
        item match {
            case Book(_, price) => price
            case Bundle(_, discount, items@_*) => {
                items.map(price2).sum - discount
            }
        }
    }
}

sealed trait Item

case class Book(desc: String, price: Double) extends Item

case class Bundle(desc: String, discount: Double, items: Item*) extends Item



/*
1000
 100 50 20 10 5 1
 
若干香  质地均匀 1h
 准确得到15分钟
 
扑克牌:
    54 最多4张最少1张, 如果你先取, 如果保证自己能赢
 */