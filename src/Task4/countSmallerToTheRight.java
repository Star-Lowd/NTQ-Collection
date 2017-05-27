/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Star Blazh
 */
public class countSmallerToTheRight {
    public static List<Integer> countSmallerToTheRight(String input, String prefix){
       long startMillisec = System.currentTimeMillis();
       String inputs[] = input.split(prefix);
       List<Integer> inputSet = new ArrayList();
       for (String in : inputs) {
           inputSet.add(new Integer(in.trim()));
       }
       List<Integer> outputSet = new ArrayList();
       
       for (int i = 0; i < inputSet.size(); i++) {
           int counter = 0;
           for (int j = i; j < inputSet.size(); j++) {
               if (inputSet.get(i) > inputSet.get(j)){
                   counter++;
               }
           }
           outputSet.add(counter);
       }
       System.out.println("Calculation Time = "+(System.currentTimeMillis() - startMillisec )+" Milliseconds");
       return outputSet;
   }
    
    public static void main(String[] args) {
                 //Task 4
        System.out.println("Task 4 \n=============================\n");
        List<Integer> output = countSmallerToTheRight("3, 8, 4, 1", ", ");
        System.out.println("countSmallerToTheRight(nums) = "+output);
    }
}
