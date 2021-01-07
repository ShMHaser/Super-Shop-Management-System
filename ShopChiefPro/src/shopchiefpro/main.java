/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopchiefpro;

import java.io.IOException;
import javax.swing.JFrame;

public class main {
	
    /**
     *
     * @param args
     * @throws IOException
     */
    @SuppressWarnings("unused")
	public static void main (String [] args) throws IOException {
		
		Login J = new Login();
                J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		J.setVisible(true);
		
	}

}
