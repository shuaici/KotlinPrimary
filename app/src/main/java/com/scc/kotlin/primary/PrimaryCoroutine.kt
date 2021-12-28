package com.scc.kotlin.primary

import android.os.SystemClock
import kotlinx.coroutines.*

suspend fun main() {
//    a()
//    b()
//    GlobalScope.launch {//在后台启动一个新的协程并继续
//        //协程中运行
//        delay(2500)//非阻塞的等待 2.5 秒钟（默认时间单位是毫秒）
//        a()
//    }
//    println("Start")
//    Thread.sleep(2000) // 阻塞主线程 2 秒钟来保证 JVM 存活

//    runBlocking {
//        a()
//    }
//    println("Start")

    //suspend
//    runBlocking {
//        launch {
//            a()
//        }
//        c()
//    }
//    println("Start")

    //coroutineScope
//    println("Start")
//    runBlocking {
//        coroutineScope {
//            launch {
//                a()
//            }
//        }
//        println("coroutineScope End")
//    }
//    println("End")
    //Job
//    var job = Job()
//    var scope = CoroutineScope(job)
//    var startTime  = System.currentTimeMillis()
//    scope.launch {
//        var nextPrintTime = startTime
//        var i = 0
//        try {
//            while (isActive) { // 可以被取消的计算循环
//                // 每300毫秒打印1次消息
//                if (System.currentTimeMillis() >= nextPrintTime) {
//                    println("Job: 请稍等 ${i++} ...")
//                    nextPrintTime += 300L
//                }
//            }
//        }finally {
//            withContext(NonCancellable) {
//                println("Job: Running finally")
//                delay(1000L)
//                println("Job: 哈哈哈哈-我是不能取消的")
//            }
//        }
//    }
//    delay(1000L)
//    println("main: 各就各位!")
//    job.cancelAndJoin()//取消该作业并等待作业执行结束
//    println("main: 结束.")

    var end = withTimeoutOrNull(1500L) {
        repeat(100) { i ->
            println("Job: 请稍等 $i ...")
            delay(600L)
        }
        "最后的尊严"
    }
    println("main: 结束.$end")//main: 结束.(nullOr最后的尊严)
}

suspend fun a() {
    println("A-Start")
    delay(1000)
    println("A-1")
    println("A-2")
    println("A-3")
}

suspend fun b() {
    println("B-Start")
    delay(1000)
    println("B-1")
    println("B-2")
    println("B-3")
}

suspend fun c() = coroutineScope {
    launch {
        println("C-Start")
        delay(1000)
        println("C-1")
        println("C-2")
    }
}
