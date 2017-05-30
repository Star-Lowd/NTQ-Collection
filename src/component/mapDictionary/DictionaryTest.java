/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component.mapDictionary;

/**
 *
 * @author Star Blazh
 */
public class DictionaryTest {
    public static void main(String[] args) {
        Dictionary<String, Integer,String> dich = new Dictionary();
        dich.put("OEO", 21, "Olasehinde Ezekiel Olaoluwa");
        dich.put("NVS", 31, "Nguyen Vang Sang");
        //dich.put("OO", 21, "Olagunju Olaotunde");
        //dich.put("Ez", 21, "Olasehinde Ezekiel Olaoluwa");
        System.out.println(dich.ContainKey("OEO", 21));
        System.out.println(dich.ContainKey("OO", 22));
        System.out.println(dich.get("OO", 22));
        System.out.println(dich.get("NVS", 31));
    }
}
