package com.scc.kotlin.primary.classkotlin

import java.io.File

// TODO: 2021/12/8 继承
/* 食物基类 */
open class Food {
    open val price = 100
    //函数必须用 open 关键字修饰，子类才能覆盖
    open fun explain() = "Food explain $price"
}

/* 继承Food */
class Apple : Food() {
    override var price = 36
    //使用 override 关键字覆盖父类函数
    override fun explain() = "Apple explain $price"

    fun effect() = "Apple 清热解毒"
}

fun main() {
    //多态：父类类型的引用子类类型的对象
    val f: Food = Apple()
    println(f.explain())
    println("--------")
    println(f is Food)//true
    println(f is Apple)//true
    println(f is File)//false

//    println(f.effect())//父类调用子类函数，报错
    //使用 as 进行类型转换
    println(f as Apple)
    //智能类型转换：kotlin 进行一次类型转换后可直接使用
    println(f.effect())


}