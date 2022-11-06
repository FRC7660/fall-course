/*
Problem statement

Whenever you visit a zoo, there are many types of animals in it. 
However, for each animal some things never change--they all have a name and an age and a country of origin. 

Use the concept of classes and inheritance to solve the exercise below!

Create a parent class named Animal.
    Inside it define:
        name -- a private member variable
        age -- a private member variable
        default constructor
        set_data(int a, String n) -- a public method that sets age and name members to the given values
        get_name() -- a public method that returns the animal's name
        get_age() -- a public method that returns the animal's age

Then there are two derived classes
        Zebra
        Dolphin
        Each derived class should have a public String message() method
            - the method returns a string with the age, name, and place of origin of that animal.
            - "The [animal_type] named [name] is [age] years old. The [animal_type] comes from [origin]."
            Hint: You have to create different message methods for each of the derived classes.
        The origin of Zebra is Africa
        The origin of Dolphin is New Zealand

    Example
        If we have an animal of class Zebra, whose name is Z with age, 2 and the country name Africa, 
        then the output should be as follows:
        "The zebra named Z is 2 years old. The zebra comes from Africa"
*/

public class Animal {
    private String name;
    private int age;

    public Animal() {
        age = 0;
        name = "";
    }
    public void set_data(int a, String n) {
        age = a;
        name = n;
    }
    public int get_age(){
        return age;
    }
    public String get_name(){
        return name;
    }
    public static void main(String[] args) {
        Zebra z = new Zebra();
        Dolphin d = new Dolphin();

        z.set_data(8, "Marty");
        d.set_data(10, "Speedy");

        System.out.println(z.message());
        System.out.println(d.message());
    }
}

class Zebra extends Animal {
    public String message() {
        return "The zebra named " + get_name() + " is " + get_age() + " years old. The zebra comes from Africa";
    }
}

class Dolphin extends Animal {
    public String message() {
        return "The dolphin named " + super.get_name() + " is " + super.get_age() + " years old. The dolphin comes from New Zealand";
    }
}