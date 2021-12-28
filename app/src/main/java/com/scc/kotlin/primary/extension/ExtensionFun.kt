package com.scc.kotlin.primary.extension

//定义School类的扩展函数
fun School.student(): String {
    return "$name-学习知识"
}

//定义String类的扩展函数
fun String.addSC(): String {
    return "$this-帅次"
}

//定义Any扩展函数
fun Any.eat(): Any {
    return this
}

//定义泛型扩展函数
fun <T> T.scww(): T {
    return this
}

//定义扩展属性
//给String类添加一个扩展属性，这个扩展属性可以统计字符长度并加10。
val String.lengthSc
    get() = this.length.plus(10)

//给School类添加个position属性
val School.position
    get() = "${name}-高级中学"

//可空类扩展
//当String为null时打印四大皆空-default
fun String?.nullWithDefault(default: String) {
    println(this ?: "四大皆空-$default")
}
//当School为null时，打印default-学校没了
fun School?.dropOut(default: String) {
    println(this ?: "$default-学校没了")
}
//infix关键字
infix fun String?.nullInfixDefault(default: String){
    println(this ?: "Infix-$default")
}
fun main() {
    //School类原来的函数
    println(School("超神学院").teacher())//超神学院-教书育人
    //School类的扩展函数
    println(School("超神学院").student())//超神学院-学习知识
    //String类的扩展函数
    println("Kotlin".addSC())//Kotlin-帅次

    //因为Any是超类，所以它的扩展函数其他类也能直接使用
    println("超类".eat())//超类
    println(15.eat())//15
    //报错，因为addSC()函数是String类的扩展函数，Any类无法直接调用
    //除非将 "超类".eat()的返回类型Any转为String再调用。
//    "超类".eat().addSC()

    //String类型WaKa调用泛型扩展函数scww()，返回String类型调用String类型扩展函数addSC()
    println("WaKa".scww().addSC())//WaKa-帅次
    //Int类型15调用泛型扩展函数scww()，返回Int类型调用apply{}函数
    println(15.scww().apply { })//15

    println("一二三四五，上山打老虎".lengthSc)//21
    println(School("新冠中学").position)//新冠中学-高级中学

    var str: String? = null
    str.nullWithDefault("空空")//四大皆空-空空

    str = "数据已到"
    str.nullWithDefault("空空")//数据已到

    var school: School? = null
    school.dropOut("没得名字")//没得名字-学校没了

    school = School("帅次学院")
    school.dropOut("默认退学")//com.scc.kotlin.primary.extension.School@19dfb72a

    str = null
    str nullInfixDefault "空值"   //Infix-空值
    str = "不空"
    str nullInfixDefault "空值"  //不空
    //这个就类似mapOf
    mapOf("Key" to "Value")
    str.scFile()//来自ScFile的问候
}