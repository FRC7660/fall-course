/*
In this coding exercise, you are given a number x, and you have to set the 
corresponding day in the variable answer. If the number given does not correspond 
to any of 1 to 7, simply set the answer to an "invalid input".
 */
public class ConditionalsChallenge2 {
    public static String week_day(int x) {
        String answer = ""; 
        // Enter your code here

        // Store your final result in the variable answer
        return answer;
    }
    public static void main(String[] args){
        System.out.println("ans should be \"Wednesday\"\n" + "your ans is " + week_day(3));
        System.out.println("ans should be \"Friday\"\n" + "your ans is " + week_day(5));
        System.out.println("ans should be \"Sunday\"\n" + "your ans is " + week_day(7));
        System.out.println("ans should be \"invalid input\"\n" + "your ans is " + week_day(8));
    }
}
