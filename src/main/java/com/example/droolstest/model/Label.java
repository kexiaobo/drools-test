package com.example.droolstest.model;

public class Label {
    private String sex;

    private Integer age;

    private Integer weight;

    private Integer salary;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Label{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", salary=" + salary +
                '}';
    }
}
