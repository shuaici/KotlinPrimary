package com.scc.kotlin.primary.classkotlin

// TODO: 2021/12/9 数据类
data class DaTang (var name:String ,val age:Int){
    val emperor = "$name,是继隋朝之后的大一统中原王朝，共历二十一帝，享国-$age-年。"
}
class DaTang2 (var name:String ,val age:Int){
    val emperor = "$name,是继隋朝之后的大一统中原王朝，共历二十一帝，享国-$age-年。"
}
fun main() {
    println(DaTang("唐朝", 289))
    // "==“比较的是内容  equals(Any)。
    // 因未重写Any的equals函数，使用的是Any默认equals函数，所以比较的还是引用。
    // "===" 比较的是引用(类所占的内存区域)
    println(DaTang2("唐朝", 289) == DaTang2("唐朝", 289))

    //这里使用的是data class，数据类重写了equals，比较的是数据类里面的数据。
    println(DaTang("唐朝", 289) == DaTang("唐朝", 289))

    //copy函数
    val datang = DaTang("唐朝", 289)
    println(datang)//DaTang(name=唐朝, age=289)
    //创建了了一个新的对象
    val diguo = datang.copy(age=500)
    println(diguo)//DaTang(name=唐朝, age=500)


}

