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
        Key key = (Key)obj;
        return key.key1.equals(this.key1) && key.key2.equals(this.key2) ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.key1);
        hash = 43 * hash + Objects.hashCode(this.key2);
        return hash;
    }
    
    
}
