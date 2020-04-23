import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    //asks user to enter an integer
    System.out.print("Enter integer: ");
    
    //reads the integer entered by user
    int no = in.nextInt();
    
    //prints the result to integer multiplied by itself
    System.out.println(no*no);
    
  }
}
