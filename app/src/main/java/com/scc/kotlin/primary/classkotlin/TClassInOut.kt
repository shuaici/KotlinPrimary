package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/16 in-out

//out
interface IProduction<out T> {
    fun effect(): T
}

open class Fruit()
class AppleHn() : Fruit()

//生产者
class FruitMarket : IProduction<Fruit> {
    override fun effect(): Fruit {
        println("FruitMarket effect")
        return Fruit()
    }
}

class AppleHnMarket : IProduction<AppleHn> {
    override fun effect(): AppleHn {
        println("AppleHnMarket effect")
        return AppleHn()
    }
}

//in
interface IConsumer<in T> {
    fun spend(t: T)
}

class Animal : IConsumer<Fruit> {
    override fun spend(t: Fruit) {
        println("Animal spend Fruit")
    }
}

class People : IConsumer<AppleHn> {
    override fun spend(t: AppleHn) {
        println("People spend AppleHn")
    }
}

//不变
interface IUnchanged<T> {
    //可返回T
    fun originally(): T
    //可作为参数传入T
    fun originally(t:T)
}

class BigStore:IUnchanged<Fruit>{
    override fun originally(): Fruit {
        return Fruit()
    }

    override fun originally(t: Fruit) {
    }
}
class SmallStore:IUnchanged<AppleHn>{
    override fun originally(): AppleHn {
        return AppleHn()
    }

    override fun originally(t: AppleHn) {
    }
}
fun main() {
    //out:可以将子类泛型对象(AppleHn)可以赋值给父类泛型对象(Fruit)
    var fm: IProduction<Fruit> = FruitMarket()
    println(fm.effect())
    //am的引用类型是Fruit对象
    //但是AppleHnMarket返回的是AppleHn对象。
    //这里将AppleHn对象赋值给Fruit对象并返回。
    var am: IProduction<Fruit> = AppleHnMarket()
    println(am.effect())

    println("-------------")
    //in:可以将父类泛型对象(Fruit)可以赋值给子类泛型对象(AppleHn)
    var fca: IConsumer<AppleHn> = Animal()
    fca.spend(AppleHn())
    println(fca)
    var fcp: IConsumer<AppleHn> = People()
    fcp.spend(AppleHn())
    println(fcp)

    println("-------------")
    var bs:IUnchanged<Fruit> = BigStore()
    println(bs)
    var ss:IUnchanged<AppleHn> = SmallStore()
    println(ss)

}
