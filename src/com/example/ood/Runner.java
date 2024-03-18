package com.example.ood;


/**
 * Write a description of class Runner here.
 *
 * @author Tobi Olanitori
 * @version 18/03/2024
 */
public class Runner {
    public static void main(String[] args) {
        Family smiths;
        smiths = new Family("mary", "fred");

        // Create the children
        Person child1;
        child1 = new Person("anne", 12);
        Person child2 = new Person("joe", 16); // shortcut
        Person child3 = new Person("anil", 14);

        // Create the dogs
        Dog d1 = new Dog("Rex", "alsatian");

        // Add the children to the array
        smiths.addChild(child1);
        smiths.addChild(child2);
        smiths.addChild(child3);

        // Add 4th child using an anonymous object
        smiths.addChild(new Person("0lek", 7));

        // Method overloading to add a child - see Family code (Polymorphism).
        smiths.addChild("ivan", 6);

        // Space out
        System.out.println();

        // Display calling the mutator
        System.out.println("***** Using showAllChildren()");
        smiths.showAllChildren();

        System.out.println();

        // Display calling the accessor
        System.out.println("***** Using getAllChildren()");
        String xx = smiths.getAllChildren();

        // The Client has control of what to do with the data
        System.out.println(xx);
        //OR shortcut :  System.out.println(smiths.getAllChildren());

        // Add dogs using different ways.
        smiths.addDog(d1);
        smiths.addDog(new Dog("Loopy", "Collie"));  // shortcut
        smiths.addDog("Fido", "Terrier");  // alternative way to add a dog in Family

        // Display dogs calling the mutator
        System.out.println("***** Using showAllDogs()");
        smiths.showAllDogs();

        // Space out
        System.out.println();

        // Display dogs calling the accessor
        System.out.println("***** Using getAllDogs()");
        System.out.println(smiths.getAllDogs());
    }
}
