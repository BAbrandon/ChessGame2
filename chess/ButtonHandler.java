package ChessGame;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * The ButtonHandler class is the controller for the buttons in the Chessview class.
 * 
 * @author NOT SURE WHO CREATED This.. haven't checked yet
 *
 */
public class ButtonHandler implements ActionListener {
	
	private static final Object Name = "<html><p><font color =black><center>Nichele Ogungbayi, Brianna Brumfield, Gloria Garza<center>"
	+ "Brandon Ashworth, Tyler Earnest<center>and Dr. Bylander</font><p></html>";
	
	private static final Object Rules = "<html><p><strong>Rules:</span></strong></p><ul><li>To start a game select 1 or 2 players.</li><li>In the top right corner it will say whose turn it is.</li><li>To move a piece click on a piecce and then click on the square you would like it to go to.</li><li>When you are done with your turn click the end turn button on the right.</li><li>Continue playing till someone wins or you click the home button.<li>Once you press ok on this screen a webpage will open up with chess rules.</li></li></ul></html>";
	
	private JButton button;
	
	/** 
	 * The view of chess 
	 */
	private ChessView view;

	/**
	 * constructor: Remember the button this is listening to.
	 * 
	 * @param buttonFrame
	 */
	public ButtonHandler(JButton button) {
		this.button = button;
	}

	/**
	 * handle button event
	 */
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		
		if (command.equals("Rules")) { //opens link to the rules of chess
			JOptionPane.showMessageDialog(button,Rules,"Rules",JOptionPane.PLAIN_MESSAGE);
			openWebpage("http://chess-teacher.com/chess-rules/");		
		} else if(command.equals("Credits")) {                      
		JOptionPane.showMessageDialog(button,Name,"                                          Credits",
					JOptionPane.PLAIN_MESSAGE);
		} else if (command.equals("End Turn")) {
			//view.switchPlayer();
		}	
	} // end method actionPerformed
	
	/**
	 * dislay webpage of rules
	 * 
	 * @param urlString
	 */
	public static void openWebpage(String urlString) {
	    try {
	        Desktop.getDesktop().browse(new URL(urlString).toURI());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}	
}