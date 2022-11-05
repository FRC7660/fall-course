/*
Problem statement
There are many school systems that give standardized GPA points instead of letter grades and vice versa. 
To bring all these institutions on the same grade scale, we have hired you! 
Your job is to take a letter grade and change it to the required GPA point.

Write a *static* method called letterToGPA that takes in a *String* value (e.g. "B+") and 
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
public class MethodsChallenge2Sol {
    public static double letterToGPA(String letter_grade) {
        double grade_point = -1;
        switch (letter_grade) {
            case "A+":
                grade_point = 4.0;
                break;
            case "A":
                grade_point = 4.0;
                break;
            case "A-":
                grade_point = 3.7;
                break;
            case "B+":
                grade_point = 3.3;
                break;
            case "B":
                grade_point = 3.0;
                break;
            case "B-":
                grade_point = 2.8;
                break;
            case "C+":
                grade_point = 2.5;
                break;
            case "C":
                grade_point = 2.0;
                break;
            case "C-":
                grade_point = 1.8;
                break;
            case "D":
                grade_point = 1.5;
                break;
            case "F":
                grade_point = 0.0;
                break;
            default:
                grade_point = -1.0;
                break;
        }
        return grade_point;
    }

    public static void main(String[] args) {
        System.out.println("the grade point of an A is: " + letterToGPA("A"));
        System.out.println("the grade point of an C is: " + letterToGPA("C"));
        System.out.println("the grade point of an D is: " + letterToGPA("D"));
        System.out.println("the grade point of an B+ is: " + letterToGPA("B+"));
        System.out.println("the grade point of an X is: " + letterToGPA("X"));
    }
}
