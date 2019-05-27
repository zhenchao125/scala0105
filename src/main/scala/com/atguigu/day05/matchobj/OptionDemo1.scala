package com.atguigu.day05.matchobj

object OptionDemo1 {
    def main(args: Array[String]): Unit = {
        val opt: Option[Double] = foo(-9)
        /*if(opt.isInstanceOf[Some[Double]]){
            println(opt.get)
        }else{
        
        }*/
        /*opt match{
            case Some(a) => println(a)
            case None =>
        }*/
    
        println(opt.getOrElse(10))
    }
    
    def foo(d: Double): Option[Double] = {
        if (d >= 0) Some(math.sqrt(d))
        else None
    }
}
