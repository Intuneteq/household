package com.example.ood;


/**
 * Write a description of class Dog here.
 *
 * @author Tobi Olanitori
 * @version 18/03/2024
 */
public class Dog
{
    private final String name;
    private final String breed;
    private final int legs;
    private int age;
    private Date dob;

    public Dog(String nm, String br)
    {
        name = nm;
        breed = br;
        legs = 4;
        dob = new Date(1,1,2000);
    }

    public void setAge(int aaa)
    {
        age = aaa;
    }


    public void setDob(int d, int m, int y)
    {
        dob = new Date(d,m,y);
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public Date getDob()
    {
        return dob;
    }

    public String getAsString()
    {
        return "Dog Name: " + name + "\nBreed: " + breed + "\nAge: "
                + age + "\nDOB:  " + dob.getAsString();
    }


}
