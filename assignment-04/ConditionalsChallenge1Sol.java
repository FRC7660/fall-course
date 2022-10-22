// for this challenge you are to implement the evenodd() method
// the method takes in an integer as input and then 
// sets answer (a string variable) to "odd" or "odd"

class ConditionalsChallenge1Sol {
    public static String evenodd(int x) {
        // Enter your code here
        // Store your final result in the variable answer
        String answer = "";
        if( x % 2 == 0){
            answer = "even";
        }else{
            answer = "odd";
        }
        
        return answer;
    }

    public static void main(String args[]){
        System.out.println("ans should be 'odd' \nyour ans is: " + evenodd(3));
        System.out.println("ans should be 'even' \nyour ans is: " + evenodd(4));
    }
}