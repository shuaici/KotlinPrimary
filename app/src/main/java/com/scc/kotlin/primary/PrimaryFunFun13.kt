package com.scc.kotlin.primary

// TODO: 2021/12/6 定义一个函数：参数是函数、简略写法、函数引用
fun main() {
    //2、声明函数
    val bookBeginner = {bookName:String,price:Double->
        "$bookName 定价为：$price"

    }
    //3、调用函数，传入函数bookBeginner
    learningAndroidBook("Kotlin 初学者",bookBeginner)

    //4、简略写法(参数排在最后)
    learningAndroidBook("Kotlin 简略写法"){bookName:String,price:Double->
        "$bookName 定价为：$price"
    }
    //5、简略写法(唯一一个参数)，()省略了
    learningAndroidBook2{bookName:String,price:Double->
        "$bookName 定价为：$price"
    }
    //6.2、函数引用
    learningAndroidBook("函数引用",::bookPriceName);
}
//6.1 定义具名函数
fun bookPriceName(bookName:String,price:Double):String{
    //具名函数这里要加return
    return "$bookName 定价为：$price"
}
//定义一个函数，参数是函数
fun learningAndroidBook2(bookPrice:(String,price:Double)->String){
    println(bookPrice("Kotlin 简略写法-唯一一个参数",48.88))
}
//1、定义一个函数(learningAndroidBook)：参数是函数(bookPrice)
fun learningAndroidBook(name:String,bookPrice:(String,price:Double)->String){
    println("$name 来自 learningAndroidBook ")
    println(bookPrice(name,48.88))
}