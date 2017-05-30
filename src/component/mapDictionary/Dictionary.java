/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component.mapDictionary;

import java.util.HashMap;

/**
 *
 * @author Star Blazh
 * @param <Key1>
 * @param <Key2>
 * @param <Value>
 */
public class Dictionary<Key1, Key2, Value> implements IDictionary<Key1, Key2, Value>{
    //private int initalSize = 0;
    HashMap<Key1, Key2> key ;
    HashMap<Key1,Value> value ;
    Dictionary(){
        //initalSize = INITIALSIZE;
        key = new HashMap();
        value = new HashMap();
    }
    
    Dictionary(Integer inital){
        //this.initalSize = inital;
        key = new HashMap();
        value = new HashMap();
    }
    
    @Override
    public Value get(Key1 key1, Key2 key2) {
        int posCount = 0;
        for (Key1 k : key.keySet()) {
            posCount++;
            if (k.equals(key1)  && key.get(k).equals(key2)){
                return value.get(key1);
            }
        }
        return null;
    }

    @Override
    public Value put(Key1 key1, Key2 key2, Value value) {
        if (!ContainKey(key1, key2)){
            key.put(key1, key2);
            this.value.put(key1,value);
            return null;
        }
        return null;
    }

    @Override
    public boolean ContainKey(Key1 key1, Key2 key2) {
        if (key.containsKey(key1) && key.get(key1).equals(key)){
            return true;
        }
        return false;
    }
    
}
