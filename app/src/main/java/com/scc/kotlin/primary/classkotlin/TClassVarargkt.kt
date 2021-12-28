package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/16 vararg

class BookMany<T : AndroidMany>(vararg item: T) {
    var data: Array<out T> = item
    operator fun get(index:Int) = data[index]
}

open class AndroidMany(name: String)
class KotlinMany(var name: String, var price: Int) : AndroidMany(name) {
    override fun toString(): String {
        return "KotlinS(name='$name', price=$price)"
    }
}

class JavaMany(var name: String, var price: Int) : AndroidMany(name) {
    override fun toString(): String {
        return "JavaS(name='$name', price=$price)"
    }
}

fun main() {
    var book = BookMany(
        KotlinMany("初学者", 18),
        KotlinMany("进阶者", 28),
        KotlinMany("终结者", 38),
        JavaMany("全面者", 35),
    )
    println(book)//com.scc.kotlin.primary.classkotlin.BookMany@3d24753a

    println(book[0])//KotlinS(name='初学者', price=18)
    println(book[2])//KotlinS(name='终结者', price=38)
}


