/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06_unchecked;

/**
 *
 * @author Shabnam Shaik
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public String age() {

        String s = " ";
        if (age < 18) {
            throw new IllegalArgumentException("not permitted");
        } else {
            s = ("permitted");
        }
        return s;
    }

    @Override
    public String toString() {
        return "\nname: " + name + "\nage: " + age;
    }

}
