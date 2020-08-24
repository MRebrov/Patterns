/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testInput;

import decorator_input.LowerCaseInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author A702906
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test/inputTest/test.txt")));
            while((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
