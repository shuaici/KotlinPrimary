@file:JvmName("SCKotlin")

package com.scc.kotlin.primary.jandk

import java.io.IOException
import kotlin.jvm.Throws

class KotlinSc {
    @JvmField
    var name = "Kotlin-SC"
    var age = 13
    companion object{
        @JvmField
        var height = 178
        @JvmStatic
        fun evaluate() = "SC是一个学习Kotlin的小渣渣"
    }
}

fun kotlinUserInfo() = "来自Kotlin的招呼"
@JvmOverloads
fun kotlinEat(bread: String = "巧克力面包", meat: String = "鸡翅") {
    println("$bread-搭配-$meat-美极了")
}
//这里的Throws是必须添加的，要不Java那边无法捕捉这个异常
@Throws(IOException::class)
fun kotlinEatException(){
    println("吃东西呛住了")
    throw IOException()
}


val hair = {colorHair:String ->
    println( "头发染成 $colorHair 即可")
}

val hairTwo = {colorHair:String,lengthHair:Int ->
    println( "头发染成$colorHair,剪至$lengthHair-厘米即可")
}
fun main() {

    println(KotlinSc.height.toString().plus("CM"))//178CM
    println(KotlinSc.evaluate())//SC是一个学习Kotlin的小渣渣

    kotlinEat();//巧克力面包-搭配-鸡翅-美极了
    kotlinEat("橙香面包")//橙香面包-搭配-鸡翅-美极了
    kotlinEat(meat = "羊肉")//巧克力面包-搭配-羊肉-美极了
    kotlinEat("奶油长杆面包","牛肉")//奶油长杆面包-搭配-牛肉-美极了
}
