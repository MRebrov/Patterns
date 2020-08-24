/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtual_proxy_image;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;
import javax.swing.Icon;

/**
 *
 * @author A702906
 */
public class ImageProxyWithState implements Icon {

    private State imageLoaded;
    private State imageNotLoaded;
    private State currentState;
    private URL imageURL;

    public ImageProxyWithState(URL url) {
        imageLoaded = new ImageLoaded(this);
        imageNotLoaded = new ImageNotLoaded(this);
        imageURL = url;
        currentState = imageNotLoaded;
    }

    public State getImageLoaded() {
        return imageLoaded;
    }

    public void setImageLoaded(State imageLoaded) {
        this.imageLoaded = imageLoaded;
    }

    public State getImageNotLoaded() {
        return imageNotLoaded;
    }

    public void setImageNotLoaded(State imageNotLoaded) {
        this.imageNotLoaded = imageNotLoaded;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public URL getImageURL() {
        return imageURL;
    }

    public void setImageURL(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {
        return currentState.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return currentState.getIconHeight();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        currentState.paintIcon(c, g, x, y);
    }
}
