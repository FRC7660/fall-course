import java.util.Scanner;

public class AdderShell {

    public static void main(String args[]) {
        Scanner my_scanner = new Scanner(System.in);
        my_scanner.useDelimiter("\\s");

        float input_1 = 0.0f;
        float total = 0.0f; 

        input_1 = my_scanner.nextFloat();

        my_scanner.close();
        System.out.println("Total is: " + total);
    }
}