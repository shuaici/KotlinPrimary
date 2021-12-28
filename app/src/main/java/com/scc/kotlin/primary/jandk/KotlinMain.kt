package com.scc.kotlin.primary.jandk
// TODO: 2021/12/21 java和kotlin互操作
fun main() {
    var user = JavaUser()
    println(user.userInfo())//
    //使用时报错：NullPointerException
//    println(user.family().length)

    //平台类型，可能为null
    var fam = user.family()
    //当fam为null时，fam?.length返回null
    println(fam?.length)//null

    println(user.name.javaClass)//查看类型：class java.lang.String

    println(user.age)
    user.age = 12
    println(user.age)
    println(user.age.javaClass)
}

fun Hello() = "来自Kotlin的招呼"