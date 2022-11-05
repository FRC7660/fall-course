/*
- Write code that draws half a pyramid using the # character.
- You are given an integer variable rows as input, and you 
  have to print the pyramid with that number of rows displaying #.
- if rows = 4, then your output should look like this:
#
# #
# # #
# # # #

- there should be a space after every hash character.
- Hint: Use for loops to implement the solution.
- Hint: System.out.print() the content and does not add the new line. 
  Whereas System.out.println() prints content and add a new line after it. 
  We can also use \n to add a new line on the console.
*/

public class LoopsChallenge3Sol {
  public static void print_pyramid(int rows) {
    for(int i = 0; i < rows; i++){
      for(int j = 0; j <= i; j++){
        System.out.print("# ");
      }
      System.out.print("\n");
    }
  }

  public static void main(String args[]) {
    System.out.println("----- 0 row pyramid -----");
    print_pyramid(0);

    System.out.println("----- 1 row pyramid -----");
    print_pyramid(1);

    System.out.println("----- 2 row pyramid -----");
    print_pyramid(2);

    System.out.println("----- 3 row pyramid -----");
    print_pyramid(3);

    System.out.println("----- 9 row pyramid -----");
    print_pyramid(9);
  }
}

/* 
your answer should be:
----- 0 row pyramid -----
----- 1 row pyramid -----
#
----- 2 row pyramid -----
#
# #
----- 3 row pyramid -----
#
# #
# # #
----- 9 row pyramid -----
#
# #
# # #
# # # #
# # # # #
# # # # # #
# # # # # # #
# # # # # # # #
# # # # # # # # #
*/