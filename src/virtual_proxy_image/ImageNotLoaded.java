/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtual_proxy_image;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author A702906
 */
public class ImageNotLoaded implements State {

    public static final int DEFAULT_ICON_WIDTH = 800;
    public static final int DEFAULT_ICON_HEIGHT = 600;
    
    private ImageProxyWithState image;
    private ImageIcon imageIcon;
    private Thread retreivalThread;
    private boolean retrieving = false;
    
    public ImageNotLoaded(ImageProxyWithState image) {
        this.image = image;
    }
    
    @Override
    public int getIconWidth() {
        return DEFAULT_ICON_WIDTH;
    }

    @Override
    public int getIconHeight() {
        return DEFAULT_ICON_HEIGHT;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;
                retreivalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(image.getImageURL(), "CD Cover");
                            c.repaint();
                            ((ImageLoaded)image.getImageLoaded()).setImageIcon(imageIcon);
                            image.setCurrentState(image.getImageLoaded());
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                retreivalThread.start();
            }
    }
    
}
