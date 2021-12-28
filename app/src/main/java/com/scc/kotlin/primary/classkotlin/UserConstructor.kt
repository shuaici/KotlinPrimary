package com.scc.kotlin.primary.classkotlin

class UserInfo(_name:String, _age:Int)  {

    var name = _name
    var age = _age
    init {
        println("初始化:$name 今年已经$age 岁了")
    }
    fun info() {
        println("$name 今年已经$age 岁了")
    }
}

fun main() {
    var user = UserInfo("SC",16)
    UserInfo2("SC2",18)
}