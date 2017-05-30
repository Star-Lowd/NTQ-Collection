/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component.mapDictionary;

/**
 *
 * @author Star Blazh
 * @param <Key1> 
 * @param <Key2> 
 * @param <Value> 
 */
public interface IDictionary<Key1, Key2, Value> extends Cloneable{
    int INITIALSIZE = 10;
    public Value get (Key1 key1 , Key2 key2);
    public Value put (Key1 key1, Key2 key2, Value value);
    public boolean ContainKey(Key1 key1, Key2 key2);
}
