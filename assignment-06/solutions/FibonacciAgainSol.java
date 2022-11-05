public class FibonacciAgainSol {
    public static String stringConcat(String s, int n) {
        s = s + " " + n;
        return s;
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        
        int prev1 = 0;
        int prev2 = 1;
        int current = 0;        
        for(int i = 2; i <= n; i++){
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }

    public static String createFibString(int n){
        String s = "";
        for(int i = 0; i <= n; i++){
            s = stringConcat(s, fibonacci(i));
        }
        return s;
    }

    public static void main(String args[]) {
        System.out.println("fib(0) is " + createFibString(0));
        System.out.println("fib(1) is " + createFibString(1));
        System.out.println("fib(2) is " + createFibString(2));
        System.out.println("fib(3) is " + createFibString(3));
        System.out.println("fib(6) is " + createFibString(6));
        System.out.println("fib(15) is " + createFibString(15));
        /*
         * your answer should be:
         * fib(0) is 0
         * fib(1) is 0 1
         * fib(2) is 0 1 1
         * fib(3) is 0 1 1 2
         * fib(6) is 0 1 1 2 3 5 8
         * fib(15) is 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
         */
    }

}
