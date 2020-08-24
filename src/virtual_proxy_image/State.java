/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtual_proxy_image;

import java.awt.Component;
import java.awt.Graphics;

/**
 *
 * @author A702906
 */
public interface State {
    
    public int getIconWidth();
    public int getIconHeight();
    public void paintIcon(Component c, Graphics g, int x, int y);
    
}
