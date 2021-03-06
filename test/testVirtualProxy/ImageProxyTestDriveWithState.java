/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testVirtualProxy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import virtual_proxy_image.ImageComponent;
import virtual_proxy_image.ImageProxy;
import virtual_proxy_image.ImageProxyWithState;

/**
 *
 * @author A702906
 */
public class ImageProxyTestDriveWithState {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Map<String, String> cds = new Hashtable<String, String>();

    public static void main(String[] args) throws Exception {
        ImageProxyTestDriveWithState testDrive = new ImageProxyTestDriveWithState();
    }

    public ImageProxyTestDriveWithState() throws Exception {
        cds.put("Ambient: Music for Airports", "http://images.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        cds.put("Buddha Bar", "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        cds.put("Ima", "http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
        cds.put("Karma", "http://images.amazon.com/images/P/B000005DBC.01.LZZZZZZZ.gif");
        cds.put("MXMXC A.D.", "http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
        cds.put("Northern Exposure", "http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
        cds.put("Selected Ambient Works, Vol. 2", "http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
        cds.put("oliver", "http://www.cs.yale.edu/homes/freeman-elisabeth/2004/9/Oliver_sm.jpg");

        URL initialURL = new URL((String) cds.get("Selected Ambient Works, Vol. 2"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        for (Iterator<String> i = cds.keySet().iterator(); i.hasNext();) {
            String name = i.next();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new ImageProxyWithState(getCDUrl(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    URL getCDUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
