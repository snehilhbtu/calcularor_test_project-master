package org.calculator.users;

import java.util.ArrayList;

public class Consumer {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public ArrayList<String> getServices() {
        return services;
    }

    public void setServices(ArrayList<String> services) {
        this.services = services;
    }

    Integer age;
    Float salary;
    ArrayList<String> services;

    public Consumer(String name, Integer age, Float salary, ArrayList<String> services) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.services = services;
    }
}
