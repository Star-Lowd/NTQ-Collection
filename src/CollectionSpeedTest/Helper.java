/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionSpeedTest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Star Blazh
 */
public class Helper {
    public static long AddlinkedList(){
        long initialMilliseconce = System.currentTimeMillis();
        LinkedList<Integer> integer = new LinkedList<>();
        for (int i = 0; i < 9999999; i++) {
            integer.add(i);
        }
        
        return System.currentTimeMillis() - initialMilliseconce;
    }
    
    public static long AddArrayList(){
        long initialMilliseconce = System.currentTimeMillis();
            ArrayList<Integer> integer = new ArrayList<>();
        for (int i = 0; i < 9999999; i++) {
            integer.add(i);
        }
        
        return System.currentTimeMillis() - initialMilliseconce;
    }
    
    public static long AddHashSet(){
        long initialMilliseconce = System.currentTimeMillis();
        HashSet<Integer> integer = new HashSet();
        for (int i = 0; i < 9999999; i++) {
            integer.add(i);
        }
        
        return System.currentTimeMillis() - initialMilliseconce;
    }
    
    public static long AddPriorityQueue(){
        long initialMilliseconce = System.currentTimeMillis();
         Queue<Integer> integer = new PriorityQueue();
        for (int i = 0; i < 9999999; i++) {
            integer.add(i);
        }
        
        return System.currentTimeMillis() - initialMilliseconce;
    }
    
    public static long AddArrayDeque(){
        long initialMilliseconce = System.currentTimeMillis();
        ArrayDeque<Integer> integer = new ArrayDeque();
        for (int i = 0; i < 9999999; i++) {
            integer.add(i);
        }
        
        return System.currentTimeMillis() - initialMilliseconce;
    }
    
    
}
