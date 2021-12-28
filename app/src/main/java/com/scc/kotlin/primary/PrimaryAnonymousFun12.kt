package com.scc.kotlin.primary

// TODO: 2021/12/6 函数类型和隐式返回、参数、类型推断
fun main() {

    //1、声明函数的输入() 输出String
    //2、实现函数
    val scFun: () -> String = {
        val name = "帅次"
        // 匿名函数不需要写retrun，最后一行就是返回值
        "$name 就是个战五渣"
    }
    //此处别忘记加()，这里是函数而不是属性
    println(scFun())

    //带参数
    val scFun2: (Int) -> String = { age ->
        val name = "帅次"
        // 匿名函数不需要写retrun，最后一行就是返回值
        "$name 就是个战$age 渣"
    }
    println(scFun2(16))

    //带1个参数，使用it
    val scFun3: (Int) -> String = {
        val name = "帅次"
        // 匿名函数不需要写retrun，最后一行就是返回值
        "$name 就是个战$it 渣"
    }
    println(scFun3(12))

    //无参类型推断
    val scFun4 = {
        val name = "帅次"
        // 匿名函数不需要写retrun，最后一行就是返回值
        "$name 无参类型推断"
    }
    println(scFun4())

    //带参类型推断
    val scFun5 = { age:Int,money:Float->
        val name = "帅次"
        // 匿名函数不需要写retrun，最后一行就是返回值
        "$name 带参类型推断 $age 岁啦，兜里$money"
    }
    println(scFun5(15,1.25f))
}