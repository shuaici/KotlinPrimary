package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/10 枚举类
enum class Color {
    RED,
    BULE,
    YELLOW
}

//2.0版本
enum class Color2(val user: UserColor) {
    RED(UserColor("小红", 15)),
    BULE(UserColor("小蓝", 20)),
    YELLOW(UserColor("小黄", 30));

    fun addUser(adduser: UserColor) =
        UserColor(
            "${adduser.name}-${user.name}", adduser.age + user.age
        )

}

data class UserColor(val name: String, val age: Int)

fun main() {
    //使用
    val blue = Color.BULE
    println(blue)
    println(blue.ordinal)

    //2.0版本
    println(Color2.BULE.user)
    println(Color2.YELLOW.user)
    //枚举定义函数
    println(Color2.RED.addUser(UserColor("新", 40)))

    println(enumValueOf<Color>("RED"))
    println(enumValues<Color2>().joinToString { it.user.toString() })
}