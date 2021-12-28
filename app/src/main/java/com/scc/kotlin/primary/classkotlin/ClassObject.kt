package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/8 单例类
/*使用object声明对象*/
object AppUtils{
    init {
        println("AppUtils init")
    }
    fun doData(){
        println("AppUtils doData")
    }
}
//使用
fun main() {
    //AppUtils既是类名又是实例名
    AppUtils.doData()
    val app1 = AppUtils
    val app2 = AppUtils
    println(app1)
    println(app2)
}