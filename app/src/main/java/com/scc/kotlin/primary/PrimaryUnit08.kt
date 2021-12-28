package com.scc.kotlin.primary

// TODO: 2021/12/3 Unit函数
fun main() {
    println(doUnit("ShuaiCi", 18))
    println(doUnit2("ShuaiCi", 18))
}
//无参数返回>默认返回Unit，可不写
//类似Java语言的void，只不过Unit是个单例类而不是关键字
private fun doUnit(name: String, age: Int):Unit {
    println("$name 今年已经 $age 了哦")
}
//不写:Unit 也一样一样的
private fun doUnit2(name: String, age: Int) {
    println("$name 今年已经 $age 了哦")
}