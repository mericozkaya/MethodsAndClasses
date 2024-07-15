package com.mericozkaya.methodsandclasses;

public class Simpsons {

    private String  name;
    private int age;
    private String job;
    //private yaptığımız için artık başka methodlarda kullanılamayacak ve hata verecek public olduğu zaman isteyen her method çağırabiliyor
    public Simpsons(String name,int age,String job){
        this.name=name;
        this.age=age;
        this.job=job;
    }
    //protected private ile aynı şey ama protected da extend edersen o sınıfın özelliklerini kullanabiliyorsun


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
