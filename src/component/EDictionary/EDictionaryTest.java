/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component.EDictionary;

/**
 *
 * @author Star Blazh
 */
public class EDictionaryTest {
    public static void main(String[] args) {
        EDictionary<String, Integer, String> dictionary = new EDictionary();
        dictionary.put("OEO", 21, "Olasehinde Ezekiel Olaoluwa");
        dictionary.put("NVS", 31, "Nguyen Vang Sang");
        //dich.put("OO", 21, "Olagunju Olaotunde");
        //dich.put("Ez", 21, "Olasehinde Ezekiel Olaoluwa");
        System.out.println(dictionary.ContainKey("OEO", 21));
        System.out.println(dictionary.ContainKey("OO", 22));
        System.out.println(dictionary.get("OEO", 21));
        System.out.println(dictionary.get("NVS", 31));
    }
}
