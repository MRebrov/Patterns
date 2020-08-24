/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protective_proxy_dateApp;

/**
 *
 * @author A702906
 */
public interface PersonBean {
    
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();
    
    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
    
}
