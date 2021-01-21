package edu.ntnu.idatt2001;

import java.util.concurrent.RecursiveTask;

public class Person {
    private String name;
    private double height;
    private String degree;
    private String favoriteFood;

    public Person(String name, double height, String degree, String favoriteFood) {
        this.name = name;
        this.height = height;
        this.degree = degree;
        this.favoriteFood = favoriteFood;
    }

    public Person(String name, String degree) {
        this.name = name;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public String getDegree() {
        return degree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
