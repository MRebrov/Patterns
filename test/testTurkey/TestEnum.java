/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testTurkey;

import adapter_duck.IteratorEnumeration;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 *
 * @author MRebrov
 */
public class TestEnum {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("abc" + i);
        }
        
        Enumeration enumeration = new IteratorEnumeration(list.iterator());
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        
    }
}
