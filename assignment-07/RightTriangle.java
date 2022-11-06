/* 
THIS IS CHALLNEGE ONE OF "CLASSES AND INHERITENCE" IN THE EDUCATIVE.IO COURSE

Problem statement:
- Calculate the area of the right-angled triangle using a class.
- Write a class having 
    - two double type variables for length and height 
    - an overloaded constructor (a constructor that takes in double length, double height) 
    - one member function called area which will return the area of a right-angled triangle
*/
public class RightTriangle {

    public static void main(String[] args) {
        RightTriangle rt1 = new RightTriangle(3, 4);
        RightTriangle rt2 = new RightTriangle(10, 4);
        System.out.println("triangle one has area " + rt1.area());
        System.out.println("triangle two has area " + rt2.area());
        /* output should be 
        triangle one has area 6.0
        triangle two has area 20.0
        */
    }
}
