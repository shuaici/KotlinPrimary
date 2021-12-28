package com.scc.kotlin.primary.extension

//定义扩展文件
fun <T> T.scFile(): T {
    println("来自ScFile的问候")
    return this
}