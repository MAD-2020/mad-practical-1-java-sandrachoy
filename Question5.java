import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    int noofInt = in.nextInt();

    //store arraylist stores integers
    //count arraylist stores the number of times the integers is entered in
    ArrayList<Integer> store = new ArrayList<>();
    ArrayList<Integer> count = new ArrayList<>();
    store.add(0);
    count.add(0);

    int mode = 0;
    int modeno = 0;
    
    //loop to add in integers to store
    for(int i = 0; i < noofInt; i++){
      int no = in.nextInt();
      store.add(no);
      //if the integer position matches j, add 1 to count
      for(int j = 0; j < store.size(); j++){
        if(no == store.get(j)){
            count.set(j,count.get(j)+1);
            break;
        }
        else{
          count.add(1);
          break;
        }
      }      
    }
    
    //if the integer is higher than current mode, change mode to new integer
    for(int x = 0; x < store.size(); x++){
      if(count.get(x) > modeno){
        mode = store.get(x);
        modeno = count.get(x);
      }
    }
    //print mode
    System.out.println(mode);
  }
}
