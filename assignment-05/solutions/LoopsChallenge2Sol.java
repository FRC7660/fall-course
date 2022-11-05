/*
in this challenge you will print out the fibonacci sequence
the fibonacci sequence is defined as 
fib(0) = 0
fib(1) = 1
fib(n) = fib(n-1) + fib(n-2) where n > 1
or
f0 f1 f2 f3 f4 f5 f6 f7 
0  1  1  2  3  5  8  11

you should calculate the nth fibonacci number and then append that 
to the "fib" string; the method will then return the fib string and print it
*/

public class LoopsChallenge2Sol {
    public static String createFibString(int n) {
        String fib = "";
        int prev2 = 0, prev1 = 1, current = 0;
        if(n == 0){
            fib = "0 ";
        }else if(n >= 1){
            fib = "0 1 ";
        }
        for(int i = 2; i <= n; i++){
            current = prev2 + prev1;
            fib = fib + current + " ";
            prev2 = prev1;
            prev1 = current;
        }
        return fib;
    }

    public static void main(String args[]) {
        System.out.println("fib(0) is " + createFibString(0));
        System.out.println("fib(1) is " + createFibString(1));
        System.out.println("fib(2) is " + createFibString(2));
        System.out.println("fib(3) is " + createFibString(3));
        System.out.println("fib(6) is " + createFibString(6));
        System.out.println("fib(15) is " + createFibString(15));
        /* your answer should be:
        fib(0) is 0 
        fib(1) is 0 1
        fib(2) is 0 1 1 
        fib(3) is 0 1 1 2
        fib(6) is 0 1 1 2 3 5 8
        fib(15) is 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
        */
    }
}


/*
alternate solution with f1 = 0

    public static String test(int n) {
        String fib = "";
        int prev1 = 0, prev2 = 1, current = 0;
        for(int i = 0; i < n; i++){
            fib = fib + current + " ";
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return fib;
    }
*/