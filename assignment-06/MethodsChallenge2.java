/*
Problem statement
There are many school systems that give standardized GPA points instead of letter grades and vice versa. 
To bring all these institutions on the same grade scale, we have hired you! 
Your job is to take a letter grade and change it to the required GPA point.

Write a *public static* method called letterToGPA that takes in a *String* value (e.g. "B+") and 
returns a *float* that represents the correct decimal GPA point (e.g., 3.3).

Use this grade scale:
    A+: 4
    A: 4
    A-: 3.7
    B+: 3.3
    B: 3
    B-: 2.8
    C+: 2.5
    C: 2
    C-: 1.8
    D: 1.5
    F: 0

If any other grade is given, simply return a -1.
Hint: Revise conditionals and see what helps keep your code short and brief
*/
public class MethodsChallenge2 {

    public static void main(String[] args) {
        System.out.println("the grade point of an A is: " + letterToGPA("A"));
        System.out.println("the grade point of an C is: " + letterToGPA("C"));
        System.out.println("the grade point of an D is: " + letterToGPA("D"));
        System.out.println("the grade point of an B+ is: " + letterToGPA("B+"));
        System.out.println("the grade point of an X is: " + letterToGPA("X"));
    }
}
