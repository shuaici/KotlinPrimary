package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/8 构造器
class UserInfo2(var name: String, _age: Int) {

    var age = _age
    var isMan = false//设置默认参数。

    init {
        println("初始化:$name 今年已经$age 岁了,$isMan")
    }
    //次构造器
    constructor(name: String) : this(name, _age = 19) {
        this.name = "$name,BOOM"
    }
    //次构造器
    constructor(name: String, _isMan: Boolean) : this(name, _age = 19) {
        this.name = "$name,BOOM"
        isMan = _isMan
        println("次构造器:$name 今年已经$age 岁了,$isMan")
    }
}
class UserInfo3 private constructor(){}

fun main() {
//    UserInfo2("主构造函数", 18)
//    //调用次构造函数
//    UserInfo2("次构造函数")
    //初始化顺序
    UserInfo2("顺讯",true)
}