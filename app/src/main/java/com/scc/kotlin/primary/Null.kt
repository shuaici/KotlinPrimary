package com.scc.kotlin.primary

// TODO: 2021/12/13 空安全
fun main() {
//    var name :String = "Kotlin"
//    name = null//报错

    //可空性
    //数据类型后面加"?"，表示可为该数据类型或者为null
    var age: Int? = 15
    age = null
    println(age)//null

    //安全调用操作符
    println(age?.plus(20))//null

    //函数中使用可空类型
    println(userInfo())

    //let
    var type: String? = "java"
    type = type?.let {
        if (it.isNotBlank()) {
            "$it,非空白字符串"
        } else {
            "Kotlin"
        }
    }
    println(type)
    type = ""//空字符
    type = type?.let {
        if (it.isNotBlank()) {
            "$it,非空白字符串"
        } else {
            "Kotlin"
        }
    }
    println(type)

    //非空断言操作符
    type = null
//    println(type!!.toString())//空指针异常

    println("------------")
    //空合并操作符(?:)
    //当type为空是，运行打印"Kotlin"
    println(type ?: "Kotlin")

    type = "Java"
    //当type 为"Java"是，运行打印"Java"
    println(type ?: "Kotlin")

    println("---?:+let----")
    type = ""
    type = type?.let { "Kotlin" }?:"Java"
    println(type)
    type = null
    type = type?.let { "Kotlin" }?:"Java"
    println(type)

    println("---as----")
    var asTest :String? = ""
    //不安全的转换操作符 as
//    println(asTest as Int)//ClassCastException
    //安全的转换操作符 as?
    println(asTest as? Int)//null
}

//返回值Int为可空
fun userInfo(): Int? {
    //name 为可空的String类型属性
    var name: String? = "Java"
    name = null
    //使用安全调用操作符(?.)
    return name?.length
}

