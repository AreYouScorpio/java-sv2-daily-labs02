package day02;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }


    public String greetingSomebody(String name) {
        return "Hello" + name + "! My name is " + this.name + "!";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


