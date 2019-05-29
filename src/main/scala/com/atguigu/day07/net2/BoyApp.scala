package com.atguigu.day07.net2

import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.atguigu.day07.net2.protocol.{BoyMessage, GirlMessage}
import com.typesafe.config.{Config, ConfigFactory}

import scala.util.Random

object BoyApp {
    def main(args: Array[String]): Unit = {
        val config: Config = ConfigFactory.parseString(
            s"""
               |akka.actor.provider="akka.remote.RemoteActorRefProvider"
               |akka.remote.netty.tcp.hostname=192.168.0.228
               |akka.remote.netty.tcp.port=20000
            """.stripMargin)
        
        val actorFactory = ActorSystem("BoySystem", config)
        
        val boyRef: ActorRef = actorFactory.actorOf(Props(classOf[Boy], "192.168.0.228", 10000), "Boy")
        
        boyRef ! "start"
        
    }
}


class Boy(host: String, port: Int) extends Actor {
    var girl: ActorSelection = _
    
    override def preStart(): Unit = {
        // 远程的path
        val path = s"akka.tcp://GirlSystem@$host:$port/user/Girl"
        girl = context.actorSelection(path)
        val a: Any = 0
    }
    
    override def receive: Receive = {
        case "start" =>
            println("Boy 开始发起攻势")
            // 要给Girl发送信息, 必须拿到Girl的引用
            girl ! "你好"
        case "你也好" =>
            println("girl说: " + "你也好")
            girl ! "交个朋友"
        case msg: String =>
            println("girl说:" + msg)
            Thread.sleep(1000)
            girl ! BoyMessage("asdfjlad", new Random().nextInt(30))
        case GirlMessage(content, bfCount) =>
            println("girls: " + content + "  " + bfCount)
            Thread.sleep(1000)
            girl ! BoyMessage("asdfjlad", new Random().nextInt(30))
    }
}