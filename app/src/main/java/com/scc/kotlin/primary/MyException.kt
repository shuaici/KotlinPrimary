package com.scc.kotlin.primary

// TODO: 2021/12/13 异常
fun main() {
    var name: String? = null
//    try {
//        name!!.plus("is good")//报错：NullPointerException
//    } catch (e: NullPointerException) {
//        println(e.message)
//    } finally {
//        println("都结束了")
//    }

//    try {
//        name!!.plus("is good")//报错：NullPointerException
//    } finally {
//        println("都结束了")
//    }

    try {
        //第三步：使用
        checkData(name)
        name!!.plus("is good")//报错：NullPointerException
    } catch (e: Exception) {
        println(e.message)
    }
}
//第二步：传入可空String
fun checkData(str:String?){
    //当str为空时，抛出显式异常
//    str?:throw ScException()
    checkNotNull(str,{"帅次牌先决条件异常"})
}
//第一步：自定义异常
class ScException():IllegalArgumentException("帅次牌异常")