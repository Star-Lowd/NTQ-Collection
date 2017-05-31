/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component.EDictionary;

import java.util.Objects;

/**
 *
 * @author Star Blazh
 */
public class Key {
    Object key1 ;
    Object key2 ;

    public Key(Object key1, Object key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    @Override
    public boolean equals(Object obj) {
        //Key key = (Key)obj;
        return this.hashCode() == obj.hashCode();
    }

    
    public static void main(String[] args) {
        Key key = new Key(3, 78);
        Key key2 = new Key(3, 78);
        Key key3 = new Key(3, 78);

        System.out.println("Key 1 memory location = "+key);
        System.out.println("Key 2 memory location = "+key2);
        System.out.println("Key 3 memory location = "+key3);
    }
}
