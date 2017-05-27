/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Star Blazh
 */
public class Anagram {

    public static int countAnagram(String input, String prefix) {
        //get time stamp in milliseconce
        long startMillisec = System.currentTimeMillis();
        //slipt input into array using the given prefix
        String[] inputToArray = input.split(prefix);
        //create and initialise new List of String
        List<String> inputs = new LinkedList();
        //add all item in splited into as list into the new array
        inputs.addAll(Arrays.asList(inputToArray));
        //create new hashset to contain distinct list of user input
        HashSet<String> inputSet = new HashSet<>();
        //loop through all element in the list (inputs)
        for (int i = 0; i < inputs.size(); i++) {
            //get String at position i and convert it to Array of characters
            char[] charactersinInput = inputs.get(i).toCharArray();
            //sort all characters in input at i
            Arrays.sort(charactersinInput);
            //add sorted character to the hash set notice (hashset has no duplicate policy)
            inputSet.add(new String(charactersinInput));
        }
        //print out number of milliseconce it takes for the programme to calculate
        System.out.println("Calculation Time = " + (System.currentTimeMillis() - startMillisec) + " Milliseconds");
        //return size of disctinct list
        return inputSet.size();
    }

    public static void main(String[] args) {
         //Task 1
        System.out.println("Task 1 \n=============================\n");
        String input = "tea, eat, apple, ate, vaja, cut, java, utc";
        int anagramCount = countAnagram(input, ", ");
        System.out.println("groupsOfAnagrams(words) = "+anagramCount);
    }

}
