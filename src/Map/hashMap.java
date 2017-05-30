/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.HashMap;
import java.util.*;

/**
 *
 * @author Star Blazh
 */
public class hashMap {
    
    public static void main(String[] args) {
        HashMap<String,Integer> people = new HashMap();
        people.put("Ezekiel", 21);
        people.put("Doan", 24);
        people.put("Thanh", 23);
        people.put("Dat", 21);
        people.put("Kilintin", 21);
        people.put("Kilintin", 31);
        
        System.out.println("\n=============================\nAll Key\n");
        for (String key : people.keySet()){
            System.out.printf("%s => %d\n", key, people.get(key));
            if (people.get(key) == 31){
                people.remove(key);
            }
            people.replace(key, people.get(key)+6);
            //people.replace(key, people.get(key)++);
        }
        
        System.out.println("\n===============================\nAll data's : \n=====================================\n");
        for(Map.Entry<String, Integer> p : people.entrySet()){
            System.out.printf("%s is %d years old\n",p.getKey(), p.getValue());
        }
    }
    
}
