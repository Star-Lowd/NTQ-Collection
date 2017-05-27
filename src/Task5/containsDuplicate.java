/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Star Blazh
 */
public class containsDuplicate {
    public static boolean containsDuplicate(String input, String prefix){
       String inputs[] = input.split(prefix);
       List inputList = new ArrayList();
       inputList.addAll(Arrays.asList(inputs));
       
       List newlist = new ArrayList();
       
       for (Object object : inputList) {
           if (newlist.contains(object)){
               return true;
           }
           newlist.add(object);
       }
       return false;
   }
    
    public static void main(String[] args) {
        
         //Task 5
        System.out.println("Task 5 \n=============================\n");
        boolean isDuplicated = containsDuplicate("1, 2, 3, 1", ", ");
        System.out.println("containsDuplicate(a) = "+isDuplicated);
    }
}
