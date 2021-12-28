package com.scc.kotlin.primary.classkotlin

class User {
    var name = ""
    var age = 0
        get() = field + 10//在原有属性上+10
//        get() = 3+15//计算属性,跟age原有的属性值没有关系。
        set(value) {
            field = value + 18
            println(field)
        }
    fun info() {
        println("$name 今年已经$age 岁了")
    }
}

fun main() {
    //实例化User类
    var user = User()
    //调用name.setName函数
    user.name = "scc"
    user.age = 3
    user.info()
}