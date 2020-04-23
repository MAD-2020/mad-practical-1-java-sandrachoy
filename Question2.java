import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    
    Scanner in = new Scanner(System.in);
    
    //asks user to enter height
    System.out.print("Enter height(m): ");
    //reads height entered by user
    double height = in.nextDouble();
    //asks user to enter weight
    System.out.print("\r\nEnter weight(kg): ");
    //reads weight entered by user
    double weight = in.nextDouble();
    //prints the bmi of user using the weight and height
    System.out.println("BMI: " + weight/(height*height));
    
  }
}
