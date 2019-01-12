import java.util.ArrayList;
import java.util.List;

public class Kata
{
  public static int dontGiveMeFive(int start, int end)
  {
  List<Integer> resultsWithoutFive = new ArrayList<>();  
      for(int i = start; i < end + 1; i++) {  
      String number = Integer.toString(i);
          
          if(number.contains("5")){
                 System.out.println("The number " + i + " has a 5 in it.");
            } else {
                 resultsWithoutFive.add(i);   
                 System.out.println("The number " + i + " does NOT have a 5 in it.");
              }   
      }
   return resultsWithoutFive.size();
   }
}