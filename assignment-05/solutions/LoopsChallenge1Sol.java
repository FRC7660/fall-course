/*
- in this coding challenge, you are given an input "num"
- you are to create a string with multiples of num
- for example if num = 5, then your string would be "5 10 15 20 25 30 35 40 45 50"
- always stop after exactly 10 mutiples
*/

public class LoopsChallenge1Sol {
    public static String test(int num) {
        String answer = "";
        for(int i = 1; i <= 10; i++){
            answer = answer + num*i + " ";
        }        
        return answer;
    }
    public static void main(String args[]){
        System.out.println("ans should be 3 6 9 . . . 30 \nyour ans is " + test(3) + "\n"); //multiples of 3
        System.out.println("ans should be 4 8 12 . . . 40 \nyour ans is " + test(4) + "\n"); //multiples of 4
        System.out.println("ans should be 5 10 15 . . . 50 \nyour ans is " + test(5) + "\n"); //multiples of 5
    }
}
