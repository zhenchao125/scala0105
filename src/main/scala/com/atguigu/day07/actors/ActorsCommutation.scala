package com.atguigu.day07.actors

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

import scala.util.Random

/**
  * Author lzc
  * Date 2019-05-29 09:55
  */
object ActorsCommutation {
    def main(args: Array[String]): Unit = {
        val actorFactory = ActorSystem("ActorsCommutation")
        
        val girlRef: ActorRef = actorFactory.actorOf(Props(classOf[Girl]), "Girl1")
        val boyRef: ActorRef = actorFactory.actorOf(Props(classOf[Boy], girlRef), "Boy1")
    
        girlRef ! "start"
        boyRef ! "start"
    
        println(girlRef.path)
        println(boyRef.path)
        
    }
}


class Boy(girl: ActorRef) extends Actor {
    override def receive: Receive = {
        case "start" =>
            println("Boy 开始发起攻势")
            // 要给Girl发送信息, 必须拿到Girl的引用
            girl ! "你好"
        case "你也好" =>
            println("girl说: " + "你也好")
            girl ! "交个朋友"
        case msg =>
            println("girl说:" + msg)
            Thread.sleep(1000)
            girl ! new Random().nextInt(100)
    }
}

class Girl extends Actor{
    override def receive: Receive = {
        case "start" =>
            println("girl 开始接收信息")

        case "你好" =>
            sender ! "你也好"
        case "交个朋友" =>
            sender ! "你想多了"
        case msg =>
            sender ! "你发的是个屁呀" + new Random().nextInt(100)
    }
}
