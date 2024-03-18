package com.example.ood;

public class Person
{
    // object fields
    private final String name;
    private int age;

    public Person (String s, int a)
    {
        name = s;
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public String getAsString()
    {
        String s ="\n  " + name + " aged: " + age ;
        return s;

    }

    public void addYear()
    {
        age = age + 1;
    }
}
