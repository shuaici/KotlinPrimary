package com.scc.kotlin.primary

fun main() {
    //apply
    var map = mutableMapOf("帅次" to 18).apply {
        put("apply-北京", 188)
        put("apply-上海", 288)
    }
    println(map)//{帅次=18, apply-北京=188, apply-上海=288}

    //let
    var letData = 20.let {
        "不知不觉过去 $it 年了"
    }
    println(letData)

    //also
    var alsoData = "AndroidSHUAICI"
    var strAlso = alsoData.also {
        println(it.length)//14
    }.also {
        println(it.startsWith("Android"))//true
    }
    println(strAlso)//AndroidSHUAICI

    //run
    var str = "Android帅次"
    var s = str.run {
        startsWith("Android")
        "哈哈哈哈哈"
    }
    println(s)//true

    var runS = str.run {
        startsWith("Android")
        println(this)//Android帅次
        "吼吼哈嘿"//这里决定下一个run的this类型
    }.run {
        println(this)//吼吼哈嘿
        18//这里的18传入到isAge函数
    }.run(::isAge)
    println(runS)//false

    //with
    var strWith = "Android帅次"
    var sWith = strWith.run {
        startsWith("Android")
        "run-$this"
    }
    println(sWith)//run-Android帅次
    sWith = with(strWith) {
        startsWith("Android")
        "with-$this"
    }
    println(sWith)//with-Android帅次

    //takeIf
    val strTakeIf = "Android帅次"
    val tkif = strTakeIf.takeIf {
        it.startsWith("Android")//返回true
    }
    println(tkif)//Android帅次
    var tkifS= strTakeIf.takeIf {
        it.startsWith("Android")
    }.takeIf {
        println("Length:${it?.length}")//Length:9
        it?.length!! > 20//返回false
    }
    println(tkifS)//null

    //takeUnless
    val strTakeIfUn = "Android帅次"
    val un = strTakeIf.takeUnless {
        it.startsWith("Android")//返回true
    }
    println(un)//null
    var un2 = strTakeIfUn.takeUnless {
        it.startsWith("帅次")//返回false
    }
    println(un2)//Android帅次
}

fun isAge(age: Int) = age > 15
