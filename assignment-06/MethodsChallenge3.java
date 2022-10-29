/*
For this challenge you will implement a public static method called sumOfDig
Method input: an integer
Method returns: the sum of all of the digits of the integer

Example
Input: 23224
Returns: 13
2 + 3 + 2 + 2 + 4 = 13

Example
Input: 764
Returns: 17
7 + 6 + 4 = 17
*/
public class MethodsChallenge3 {

    public static void main(String[] args) {
        System.out.println("input is 23224; the sum is " + sumOfDig(23224));
        System.out.println("input is 0; the sum is " + sumOfDig(0));
        System.out.println("input is 764234234; the sum is " + sumOfDig(764234234));
        /* your terminal output should look like this:
        input is 23224; the sum is 13
        input is 0; the sum is 0
        input is 764234234; the sum is 35
        */
    }
}