package com.example.ood;

import java.util.ArrayList;

/**
 * Write a description of class Family here.
 *
 * @author Tobi Olanitori
 * @version 18/03/2024
 */
public class Family {
    private final String mother;
    private final String father;
    private Person[] children;      // declare an array
    private int childCount;
    private final int MAX_CHILDREN = 5; // Declare a constant for max number of children
    private final ArrayList<Dog> myDogs;  // declare ArrayList
    // declare a collection of children - what type of object will be stored ???


    public Family(String ma, String pa) {
        mother = ma;
        father = pa;

        // create ArrayList
        myDogs = new ArrayList<Dog>();

        childCount = 0;

        // Create the collection of children
        // Create a fixed size array.
        // Opted to use the class constant
        children = new Person[MAX_CHILDREN];
    }

    /**
     * Add by Person object
     */
    public void addChild(Person ch) {
        // Task 1: Amend so that it is not possible to add more children than the array can hold
        if (cantAddChild()) return;

        children[childCount] = ch;

        // Update child count
        childCount++;
    }

    /**
     * Add Child by person dependencies.
     *
     * @param nnn child name
     * @param ag  child age
     */
    public void addChild(String nnn, int ag) {
        // Task 1: Amend so that it is not possible to add more children than the array can hold
        if (cantAddChild()) return;

        // Declare person variable
        Person temp;

        // Create a child object from parameter data
        temp = new Person(nnn, ag);

        // Add a child object
        children[childCount] = temp;

        // Update child count
        childCount++;
    }

    /**
     * Output all elements to the terminal window
     */
    public void showAllChildren() {
        for (int index = 0; index < childCount; index++) {
            System.out.println(children[index].getAsString());
        }
    }

    /**
     * Accumulate all elements and return as a String
     * I Refactored using string builder to concatenate the strings
     *
     * @return All children formatted and as a string.
     * @author Tobi Olanitori
     */
    public String getAllChildren() {
        StringBuilder s = new StringBuilder();

        for (int index = 0; index < childCount; index++) {
            s.append(children[index].getAsString()).append("\n");
        }

        return s.toString();
    }


    /**
     * returns the number of children in their collection
     */
    public int noOfChildren() {
        return childCount;
    }

    /**
     * Print to the Terminal window
     *
     * @param position index position in the children array
     */
    public void showAChild(int position) {
        // show one child - you need to know its position in
        if (position >= 0 && position < childCount) {
            Person ppp = children[position];
            System.out.println(ppp.getAsString());
        }
    }

    public Person getAChild(int position) {
        // Get a child given its position in the list. Make sure to check the parameter
        if (position >= 0 && position < childCount) {
            return children[position];
        }
        return null;
    }

    /**
     * Remove a child from the children array.
     *
     * @param name of child to be removed
     */
    public void removeAChild(String name) {
        Person[] newChildrenArr = new Person[MAX_CHILDREN];

        for (int i = 0, j = 0; i <= childCount; i++) {
            Person child = children[i];
            if (!child.getName().equals(name)) {
                newChildrenArr[j] = child;
                j++;
            }
        }
        children = newChildrenArr;
    }

    public void removeAChild(int position) {
        Person child = getAChild(position);

        // End method if no child was retrieved.
        if (child == null) return;

        // Declare a new array for children
        Person[] newChildrenArr = new Person[MAX_CHILDREN];

        for (int i = 0, j = 0; i <= childCount; i++) {
            Person ch = children[i];

            if (!ch.getName().equals(child.getName())) {
                newChildrenArr[j] = child;
                j++;
            }
        }

        children = newChildrenArr;
    }

    /* add a dog object**/
    public void addDog(Dog gg) {
        myDogs.add(gg);
    }

    /**
     * add dog alternative
     **/
    public void addDog(String nnn, String bbb) {
        Dog temp;

        // Create dog object from parameter data
        temp = new Dog(nnn, bbb);

        // Add a dog object
        myDogs.add(temp);
    }

    /**
     * returns the number of dogs in the collection
     */
    public int noOfDogs() {
        return myDogs.size();
    }

    /**
     * remove a dog at the position indicated by the parameter
     */
    public void removeDog(int position) {

        // Check If the position argument is within range of dog list
        if (position >= 0 && position < myDogs.size()) {
            myDogs.remove(position);
        }
    }

    /**
     * show in the Terminal Window, the dog at the position indicated by the parameter
     * from its collection
     */
    public void showADog(int position) {
        if (position >= 0 && position < myDogs.size()) {
            Dog ddd;
            ddd = myDogs.get(position);
            System.out.println(ddd.getAsString());
        }
    }

    /**
     * returns a String representation of the dog in the position given
     * by the parameter
     */
    public Dog getADog(int position) {
        if (position >= 0 && position < myDogs.size()) {
            Dog ddd;
            ddd = myDogs.get(position);
            return ddd;
        }
        return null;
    }

    //**************using loops **************

    /**
     * Print all dogs to the terminal window.
     * <p>
     * Refactored into a for loop from a while loop.
     */
    public void showAllDogs() {
        for (Dog dd : myDogs) {
            System.out.println(dd.getAsString());
        }
    }

    /**
     * Task: write a method: "getAllDogs()"
     *
     * @return Formatted string of all dogs belonging to the object.
     */
    public String getAllDogs() {
        StringBuilder s = new StringBuilder();

        for (Dog dd : myDogs) {
            s.append(dd.getAsString()).append("\n");
        }

        return s.toString();
    }

    /**
     * Validates if the max children constant is not exceeded.
     * Abstraction implemented by setting the access modifier to private.
     *
     * @return true if child count is more than or equals to the max children, false otherwise.
     */
    private boolean cantAddChild() {
        return childCount >= MAX_CHILDREN;
    }

    public String getMother() {
        return mother;
    }

    public String getFather() {
        return father;
    }
}



