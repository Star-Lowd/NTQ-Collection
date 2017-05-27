/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Star Blazh
 */
public class sortedSquaredArray {
    
    public static List<Object> sortedSquaredArray(String input, String prefix){
        long startMillisec = System.currentTimeMillis();
        String []Inputs = input.split(prefix);
        HashSet inputSet = new HashSet();
        List<Object> outputSet = new LinkedList();
        inputSet.addAll(Arrays.asList(Inputs));
        Iterator it = inputSet.iterator();
        while (it.hasNext()) {           
            int value = Integer.parseInt(it.next()+"");
            outputSet.add(value*value);
        }
        System.out.println("Calculation Time = "+(System.currentTimeMillis() - startMillisec )+" Milliseconds");
        System.out.println(inputSet);
        return outputSet;
       
    }
    
    public static void main(String[] args) {
          //Task 2
        System.out.println("Task 2 \n=============================\n");
        String input = "-6, -4, 1, 2, 3";
        List sortedSquaredArray = sortedSquaredArray(input, ", ");
        System.out.println("groupsOfAnagrams(words) = "+sortedSquaredArray);
    }
    
}
