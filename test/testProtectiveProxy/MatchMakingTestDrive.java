/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testProtectiveProxy;

import java.lang.reflect.Proxy;
import protective_proxy_dateApp.NonOwnerInvocationHandler;
import protective_proxy_dateApp.OwnerInvocationHandler;
import protective_proxy_dateApp.PersonBean;
import protective_proxy_dateApp.PersonBeanImpl;

/**
 *
 * @author A702906
 */
public class MatchMakingTestDrive {
    
    public static void main(String[] args) {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe Tribiani");
        joe.setHotOrNotRating(8);
        PersonBean ownerProxy = OwnerInvocationHandler.getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("Food, girls, acting");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch(Exception ex) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
        System.out.println(Proxy.isProxyClass(OwnerInvocationHandler.class));
        
        PersonBean nonOwnerProxy = NonOwnerInvocationHandler.getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("Running");
        } catch (Exception ex) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(10);
        System.out.println("Rating set form non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }
}
