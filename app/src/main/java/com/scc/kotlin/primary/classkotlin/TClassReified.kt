package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/16 lineon+reified

class BookS<T : AndroidS> {

    //T的类型由anonymous()返回类型推断决定
    inline fun <reified T> readBook(anonymous: () -> T): T {
        var list = listOf(
            KotlinS("Kotlin 初学者", 12),
            JavaS("Java 帅次", 28)
        )
        var data = list.shuffled().first()
        println(data)
        //如果data是T则返回data,否则执行anonymous()
        return if (data is T) {
            data
        } else {
            anonymous()
        }
    }
}

open class AndroidS(name: String)
class KotlinS(var name: String, var price: Int) : AndroidS(name){
    override fun toString(): String {
        return "KotlinS(name='$name', price=$price)"
    }
}
class JavaS(var name: String, var price: Int) : AndroidS(name){
    override fun toString(): String {
        return "JavaS(name='$name', price=$price)"
    }
}

fun main() {
    var bookS:BookS<AndroidS> = BookS()
    //由anonymous()推断决定T的类型，这里的T是KotlinS
    var data = bookS.readBook {
        KotlinS("Anonymous-K",23)
    }
    println(data)
}


