package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/16 泛型
//1、创建泛型类
class TFood<T>(item: T) {
    var tem: T = item

    init {
        println(if (item is TApple) ((item as? TApple)?.price) else item)
    }

    //添加泛型函数
    fun getItem(): T? {
        return tem
    }

    //多泛型参数,<R>返回泛型类型
    fun <R> getItem(itemFun: (T) -> R): R {
        return itemFun(tem)
    }
}

open class Vip(price:Int)
//2、创建传入的类
class TApple(var price: Int): Vip(price)

//定义泛型接口
interface IFoodEffect<T>{
    fun effect(item:T)
}
//实现接口
class Banana:IFoodEffect<String>{
    override fun effect(item: String) {
        println(item)//item
    }

}
//3、使用
fun main() {
    //传入Int类型
    var i = TFood(30)//30
    //传入String类型
    var s = TFood("水果")//水果
    //传入实体对象
    var apple = TFood(TApple(13))//13

    //使用泛型函数
    s.getItem().run {
        println(this)//水果
    }
    apple.getItem().run {
        println(this)//实例对象：TApple@3f3afe78
        println(this?.price)//13
    }
    //传入Type类型，返回Int类型
    var intType = apple.getItem {
        //it:TApple
        it.price
    }
    Banana().effect("常食香蕉有益于大脑，预防神经疲劳，还有润肺止咳、防止便秘")
}