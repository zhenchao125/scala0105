package com.atguigu.day07.actor

import akka.actor.{Actor, ActorRef, ActorSystem, Props}


/**
  * Author lzc
  * Date 2019-05-29 09:26
  */
object HelloWorld {
    
    
    
    def main(args: Array[String]): Unit = {
        // 1. 先有actor系统
        val actorFactory = ActorSystem("HelloWorld")
        // 2. 创建actor
        val props: Props = Props(classOf[HelloActor])
        val helloActor: ActorRef = actorFactory.actorOf(props, "HelloActor")
        //3. 给actor发送数据
        helloActor ! "start"
        helloActor ! "ok"
        
    }
}

class HelloActor extends Actor {
    override def receive: Receive = {
        case "start" =>
            println("start...")
        case "ok" =>
            println("ok...")
    }
}