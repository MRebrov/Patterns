/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter_duck;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author MRebrov
 */
public class EnumerationIterator implements Iterator {

    Enumeration enumeration;
    
    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }
    
    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
         return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported.");
    }
    
}
