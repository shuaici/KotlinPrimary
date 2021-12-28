package com.scc.kotlin.primary

// TODO: 2021/12/3 函数
fun main() {
    println(doUserInfo("ShuaiCi", 18))
    //如果使用命名值参，就可以不用管值参的顺序
    println(doUserInfo(age = 6, name = "Kotlin"))

    //默认参数，可不传age
    println(doScUserInfo("Android"))
    //可传age
    println(doScUserInfo("Java",30))
}

private fun doUserInfo(name: String, age: Int): String {
    return "$name 今年已经$age 了哦"
}

//默认参数：预先给age指定默认值15
private fun doScUserInfo(name: String, age: Int = 15): String {
    return "$name 今年已经$age 了哦"
}