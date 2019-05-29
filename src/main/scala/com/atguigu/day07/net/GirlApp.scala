package com.atguigu.day07.net

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.{Config, ConfigFactory}

import scala.util.Random

/**
  * Author lzc
  * Date 2019-05-29 10:18
  */
object GirlApp {
    def main(args: Array[String]): Unit = {
        val config: Config = ConfigFactory.parseString(
            s"""
               |akka.actor.provider="akka.remote.RemoteActorRefProvider"
               |akka.remote.netty.tcp.hostname=192.168.0.228
               |akka.remote.netty.tcp.port=10000
            """.stripMargin)
    
        val actorFactory = ActorSystem("GirlSystem", config)
    
        val girlRef: ActorRef = actorFactory.actorOf(Props(classOf[Girl]), "Girl")
        
        girlRef ! "start"
        
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