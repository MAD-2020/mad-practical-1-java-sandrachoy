import java.util.Scanner;

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

    ArrayList<Integer> store = new ArrayList<>();
    ArrayList<Integer> count = new ArrayList<>();
    store.add(0);
    count.add(0);

    int mode = 0;
    
    for(int i = 0; i < noofInt; i++){
      int no = in.nextInt();
      store.add(no);
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
    
    for(int x = 0; x < store.size(); x++){
      if(count.get(x) > mode){
        mode = store.get(x);
      }
    }

    System.out.println(mode);
    
  }
}
