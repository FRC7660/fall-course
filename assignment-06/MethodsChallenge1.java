/* 
Problem statement
- create a public static method checkSum that adds two integer arguments and returns 0, 1 or 2.
- Your method will take in two integers num1 and num2 as input.
    - arguments are pass by value to the method
        - don't worry about this too much for now, we will review later
- Your method will add num1 and num2 and check if their sum is less than 100, equal to 100, or more than 100

- If sum is less than 100, set the value of the check variable to 0
- If sum is greater than 100, set the value of the check variable to 1
- If sum is equal to 100, set the value of the check variable to 2.
- In the end, your method will return the check variable.

Example
Method Input: num1 = 4, num2 = 80
Method Returns: 0
*/

public class MethodsChallenge1 {

    public static void main(String[] args) {
        System.out.println(checkSum(4, 80));
        /* add more statements like the above print statement to test your code */
    }    
}