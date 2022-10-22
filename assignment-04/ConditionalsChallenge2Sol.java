/*
In this coding exercise, you are given a number x, and you have to set the 
corresponding day in the variable answer. If the number given does not correspond 
to any of 1 to 7, simply set the answer to an "invalid input".
 */
public class ConditionalsChallenge2Sol {
    public static String week_day(int x) {
        String answer = "";
        // Enter your code here
        switch (x) {
            case 1:
                answer = "Monday";
                break;
            case 2:
                answer = "Tuesday";
                break;
            case 3:
                answer = "Wednesday";
                break;
            case 4:
                answer = "Thursday";
                break;
            case 5:
                answer = "Friday";
                break;
            case 6:
                answer = "Saturday";
                break;
            case 7:
                answer = "Sunday";
                break;
            default:
                answer = "invalid input";
                break;
        }

        // Store your final result in the variable answer
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("ans should be \"Wednesday\"\n" + "your ans is " + week_day(3));
        System.out.println("ans should be \"Friday\"\n" + "your ans is " + week_day(5));
        System.out.println("ans should be \"Sunday\"\n" + "your ans is " + week_day(7));
        System.out.println("ans should be \"invalid input\"\n" + "your ans is " + week_day(8));
    }
}
