/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtual_proxy_image;

import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JComponent;

/**
 *
 * @author A702906
 */
public class ImageComponent extends JComponent {
    
    private Icon icon;
    
    public ImageComponent(Icon icon) {
        this.icon = icon;
    }
    
    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w) / 2;
        int y = (600 - h) / 2;
        icon.paintIcon(this, g, x, y);
    }
    
}
