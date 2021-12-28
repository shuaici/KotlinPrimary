package com.scc.kotlin.primary.jandk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

class JavaMain {
    public static void main(String[] args) {
//        System.out.println(KotlinUserKt.kotlinUserInfo());//来自Kotlin的招呼
        System.out.println(SCKotlin.kotlinUserInfo());//来自Kotlin的招呼
        KotlinSc kotlinSc = new KotlinSc();
        System.out.println(kotlinSc.name);//Kotlin-SC
        //
        System.out.println(KotlinSc.height + "CM");//178CM
        System.out.println(KotlinSc.evaluate());//SC是一个学习Kotlin的小渣渣
        //使用Java调用未使用@JvmOverloads注解的函数
        SCKotlin.kotlinEat("Java牌面包");//Java牌面包-搭配-鸡翅-美极了

//        try {
//            SCKotlin.kotlinEatException();//吃东西呛住了
//        } catch (IOException e) {
//            System.out.println(e);//java.io.IOException
//            e.printStackTrace();
//        }

        Function1<String, Unit> hair = SCKotlin.getHair();
        hair.invoke("红色");//头发染成 红色 即可
        Function2<String, Integer, Unit> hairTwo = SCKotlin.getHairTwo();
        hairTwo.invoke("蓝色",8);//头发染成蓝色,剪至8-厘米即可
    }
}
