package com.atguigu.day06.partial

object PartialDemo1 {
    def main(args: Array[String]): Unit = {
        // 得到油数字+1组成新的集合
//        val list2: List[Int] = list.filter(x => x.isInstanceOf[Int]).map(x => x.asInstanceOf[Int] + 1)
//        println(list2)
    
       /* val list2: List[AnyVal] = list.map(x => x match {
            case a: Int => a
            case _ =>
        })
        println(list2)*/
        
        /*list.map({
            case a: Int => println(a)
            
        })*/
    
        val list = List(1, 2, 3, 4, "abc", false)
        // collect = filter + map
        val list2: List[Int] = list.collect({
            case a: Int => a + 1
            case b: Boolean => 0
        })
        println(list2)
    }
}

/*
偏函数
    特殊的函数
    
    用大括号括起来的的一系列的case语句就是一个偏函数
    {
        case (ant, b) =>

        
    }
    主要用于去对部分参数来做处理
    
    
    只有一个函数支持把偏函数当做偏函数来对待: collect
    
    任何接收函数的地方, 都可以传递偏函数进去
    
    

 */