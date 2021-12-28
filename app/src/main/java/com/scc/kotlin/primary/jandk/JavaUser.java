package com.scc.kotlin.primary.jandk;

class JavaUser {
    public String name = "Java";
    private int age =18;

    public int getAge() {
        System.out.println("---getAge---");
        return age;
    }

    public void setAge(int age) {
        System.out.println("---setAge---");
        this.age = age;
    }

    public String userInfo(){
        return "Java-帅次";
    }
    //返回null
    public String family(){
        return null;
    }
}
