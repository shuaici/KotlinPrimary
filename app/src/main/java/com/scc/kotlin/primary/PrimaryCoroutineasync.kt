package com.scc.kotlin.primary

import kotlinx.coroutines.*

fun main() {
//    runBlocking {
//        //返回执行时间,以毫秒为单位
//        var time = measureTimeMillis {
//            var deferred = async(start = CoroutineStart.LAZY) {
//                d()
//                "2021-12-27"
//            }
//            var deferred2 = async(start = CoroutineStart.LAZY) {
//                e()
//                "16:46"
//            }
//            println("开始执行")
////            deferred.start()
////            deferred2.start()
//            println("执行完毕：${deferred.await()+deferred2.await()}")
//        }
//        println("用时：$time ms")
//    }

//    runBlocking {
//        //返回执行时间,以毫秒为单位
//        var time = measureTimeMillis {
//            var deferred = withContext(Dispatchers.Default) {
//                d()
//                "2021-12-27"
//            }
//            var deferred2 = withContext(Dispatchers.Default) {
//                e()
//                "16:46"
//            }
//            println("开始执行")
//            println("执行完毕：$deferred-$deferred2")
//        }
//        println("用时：$time ms")
//    }
    runBlocking {
        val a = async {
            log("这是第一个协程")
            "第一梯队"
        }
        val b = async {
            log("这是第二个协程")
            "第二梯队"
        }
        log("结论：${a.await()}-${b.await()}")
    }

}

fun log(msg: String) = println(" [ ${Thread.currentThread().name} ] $msg ")

suspend fun d() {
    println("D-Start")
    delay(1000L)
    println("D-1")
}

suspend fun e() {
    println("E-Start")
    delay(500L)
    println("E-1")
}
