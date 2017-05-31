/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component.EDictionary;

import component.mapDictionary.IDictionary;
import java.util.HashMap;

/**
 *
 * @author Star Blazh
 * @param <Key1> 
 * @param  <Key2> 
 * @param  <Value> 
 */
public class EDictionary<Key1, Key2, Value> implements IDictionary<Key1, Key2, Value>{
    HashMap<Key, Value> dictionary;
    public EDictionary() {
        dictionary = new HashMap();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
    
    @Override
    public Value get(Key1 key1, Key2 key2) {
        return dictionary.get(new Key(key1, key2));
    }

    @Override
    public Value put(Key1 key1, Key2 key2, Value value) {
       return dictionary.put(new Key(key1, key2), value);
    }

    @Override
    public boolean ContainKey(Key1 key1, Key2 key2) {
        return dictionary.containsKey(new Key(key1, key2));
    }
    
}
