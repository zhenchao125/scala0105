package com.atguigu.day03.traitdemo

object TraitDemo2 {
    def main(args: Array[String]): Unit = {
        // 创建对象的时候动态混入特质
        val mysql = new Mysql with BetterConnect with BestConnect
        mysql.connect2Mysql()
        
    }
    
    
}

trait Connect2DB {
    def connect(): Unit = {
        println("Connect2DB....")
    }
}

class Mysql extends Connect2DB {
    def connect2Mysql() = {
        connect()
    }
    
    override def connect(): Unit = {
        println("Mysql  ....")
        
        super.connect()
    }
}

trait BetterConnect extends Connect2DB {
    override def connect(): Unit = {
        println("更好的连接到数据库的方法....")
        
        super.connect()
    }
}

trait BestConnect extends Connect2DB {
    override def connect(): Unit = {
        println("最好    的连接到数据库的方法....")
        
        super.connect()
    }
}

/*

动态混入


*/