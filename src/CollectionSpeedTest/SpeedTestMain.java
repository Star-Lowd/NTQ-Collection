/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionSpeedTest;

import static CollectionSpeedTest.Helper.AddArrayDeque;
import static CollectionSpeedTest.Helper.AddArrayList;
import static CollectionSpeedTest.Helper.AddPriorityQueue;
import static CollectionSpeedTest.Helper.AddlinkedList;

/**
 *
 * @author Star Blazh
 */
public class SpeedTestMain {
    public static void main(String[] args) {
        System.out.println("LinkedList took "+AddlinkedList() +" Milliseconce to Handle 9999999 add request");
        System.gc();
        System.out.println("ArrayList took "+AddArrayList()+" Milliseconce to Handle 9999999 add request");
        System.gc();
        System.out.println("HashSet took "+Helper.AddHashSet()+" Milliseconce to Handle 9999999 add request");
        System.gc();
        System.out.println("PriorityQueue took "+AddPriorityQueue()+" Milliseconce to Handle 9999999 add request");
        System.gc();
        System.out.println("ArrayDeque took "+AddArrayDeque()+" Milliseconce to Handle 9999999 add request");
        System.out.println("\n=====================================================\nContains Speed Test\n\n");
        
        System.out.println("ArrayList " + Helper.TestContainArrayList());
        System.out.println("Stack " + Helper.TestContainStack());
        System.out.println("LinkedList " + Helper.TestContainLinkedList());
        System.out.println("HashSet " + Helper.TestContainHashSet());
        System.out.println("PriorityQueue " + Helper.TestContainPriorityQueue());
        System.out.println("ArrayDeque " + Helper.TestContainArrayDeque());
    }
}
