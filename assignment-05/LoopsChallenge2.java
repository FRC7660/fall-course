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

public class LoopsChallenge2 {
    public static String createFibString(int n) {
        String fib = "";
        // Enter your code here
        // Store your final result in the variable fib
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
