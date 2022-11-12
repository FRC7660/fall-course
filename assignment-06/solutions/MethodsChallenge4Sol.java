/*
- In this challenge you will write a public static method called change_case
- If the length of the input string is even, your method will
change the string to be all upper case 
- If the length of the input string is odd, your method will
change the string to be all lower case 

Example: 
Input: "Byting Irish" [string is 12 characters long]
Output: "BYTING IRISH"
*/
public class MethodsChallenge4Sol {
    public static String change_case(String input) {
        //Write your code here
        //Declare any variables that are needed
        String output = "";
        if(input.length() % 2 == 0){
            output = input.toUpperCase();
        }else{
            output = input.toLowerCase();
        }

        //Change the return statement accordingly
        return output;
    }
    public static void main(String[] args) {
        System.out.println(change_case("Byting Irish"));
        System.out.println(change_case("aBcDeF"));
        System.out.println(change_case("I am REALLY learning programming!"));
        System.out.println(change_case("I am really learning programming"));
    }
}
