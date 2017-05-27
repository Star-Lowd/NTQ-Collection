/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Star Blazh
 */
public class firstDuplicate {
    public static Integer firstDuplicate(String input, String prefix){
       long startMillisec = System.currentTimeMillis();
       String inputs[] = input.split(prefix);
       List<Integer> inputSet = new ArrayList();
       for (String in : inputs) {
           inputSet.add(new Integer(in.trim()));
       }
      
       for (int i = 0; i < inputSet.size(); i++) {
           if (inputSet.get(i).intValue() == inputSet.get(i+1).intValue()){
               System.out.println("Calculation Time = "+(System.currentTimeMillis() - startMillisec )+" Milliseconds");
               return inputSet.get(i);
           }
       }
       
       System.out.println("Calculation Time = "+(System.currentTimeMillis() - startMillisec )+" Milliseconds");
       return -1;
   } 
    
    public static void main(String[] args) {
        
         //Task 3
        System.out.println("Task 3 \n=============================\n");
        int firstDuplicate = firstDuplicate("2, 3, 3, 1, 5, 2", ", ");
        System.out.println("firstDuplicate(a) = "+firstDuplicate);
    }
}
