import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);

    int no = in.nextInt();
    //loop the number of times that is entered
    for(int i=no; i > 0; i--){
      //loop while x is lesser than i, with each loop increase the number of *
      for(int x=0; x < i; x++){
        System.out.print("*");
      }
      //allows for the * to be printed on a new line each loop
      System.out.println();
    }
    
  }
}
