package fr.maboite;


public class MyPojo {
    //Données membres
    public String name;
    public int age;

    //Constructor

    public MyPojo(String name) {
        this.name = name;
    }

    //Getters/Setters

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


}
