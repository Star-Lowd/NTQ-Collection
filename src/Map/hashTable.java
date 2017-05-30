/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.*;


/**
 *
 * @author Star Blazh
 */
public class hashTable {
     public static class Person{
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("Name : %-20s Age : %-20d", this.name, this.age);
        }
        
        
    }
    public static void main(String[] args) {
        Hashtable <Integer, hashTable.Person> person = new Hashtable();
        //hashTable.Person ezekiel = new Person("Ezekiel", 21);
        person.put(3456, new hashTable.Person("Ezekiel", 21));
        person.put(3756, new hashTable.Person("Anh", 31));
        person.put(3456, new hashTable.Person("Thanh", 24));
        person.put(3956, new hashTable.Person("Dat", 20));
        person.put(346, new hashTable.Person("Mai", 26));
        
        Enumeration<Integer> keys = person.keys();
        while(keys.hasMoreElements()) {
            System.out.println(person.get(keys.nextElement()));
        }
        //using entry
        System.out.println("\n=====================================\nEntry=========================\n");
        for (Map.Entry<Integer, hashTable.Person> p : person.entrySet()) {
            System.out.printf("Key: %-20d Value :%-20s\n", p.getKey(), p.getValue());
        }
    }
}
