package com.scc.kotlin.primary

// TODO: 2021/12/6 函数返回类型为匿名函数
fun main() {
    //使用
    val funName = helloSc()
    println(funName(15))
}
//定义具名函数，返回类型为匿名函数
fun helloSc():(Int)->String{
    val name = "渣渣次"
    //返回的匿名函数，age传入的参数
    return {age->
        //匿名函数返回类型
        "$age 岁的$name"
    }
}