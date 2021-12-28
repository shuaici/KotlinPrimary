package com.scc.kotlin.primary

// TODO: 2021/12/3 String模板
fun main() {
    val name: String = "Shuaici"
    val age: Int = 18
    val money: Float = 1.25f
    //引号内放入变量值
    println("$name 今年 $age ,身上带了 $money 巨款")

    val isMan: Boolean = true
    //添加表达式
    println("$name 是个 ${if (isMan) "纯爷们" else "萌妹子"}")
}