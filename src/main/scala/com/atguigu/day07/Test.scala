package com.atguigu.day07

object Test {
    def compute(input: Int): Either[String, Double] = {
        if (input > 0)
            Right(math.sqrt(input))
        else
            Left("Error computing, invalid input")
    }
    
    def displayResult(result: Either[String, Double]): Unit = {
        /*result match {
            case Left(value) => println(s"error = $value")
            case Right(error) => println(s"result = $error")
        }*/
        
        if (result.isRight) {
            println(result.right.get)
        }else{
            println(result.left.getOrElse("aa"))
        }
    }
    
    def main(args: Array[String]): Unit = {
        // 使用模式匹配来取出其中的值
        displayResult(compute(10))
        displayResult(compute(-10))
    }
}

