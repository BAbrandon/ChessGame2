package ChessGame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The PanelSwitcherView class extends JFrame.
 * To be able to switch between home and board panels.
 * 
 * @author Nichele
 *
 */
public class PanelSwitcherView extends JFrame{
	
	/**
	 * Holds the panel of the game page
	 */
	private ChessView boardPanel;
	/**
	 * Holds the panel of the home page
	 */
	private ChessViewHome homePanel;

	/**
	 * constructor: add boards to the panels
	 * 
	 * @param board
	 * @param home
	 */
	public PanelSwitcherView(ChessView board,ChessViewHome home) {
		super("Section 1 Team 1: Chess Game!");

		boardPanel = board;
		homePanel = home;
		boardPanel.setPanelSwitcher(this);

		JPanel pNorth = new JPanel();
		JPanel pCenter = new JPanel();
	//	JPanel pWest = new JPanel();
	//	JPanel pEast = new JPanel();
	//	JPanel pSouth = new JPanel();

		add(pNorth, BorderLayout.NORTH);
		add(pCenter, BorderLayout.CENTER);
	//	add(pEast, BorderLayout.EAST);
	//	add(pSouth, BorderLayout.SOUTH);
	//	add(pWest, BorderLayout.WEST);
		
		/**
		 * set colors for each panel
		 */
		pNorth.setBackground(new Color(218, 215, 197));
		pCenter.setBackground(new Color(218, 215, 197));
	//	pEast.setBackground(new Color(218, 215, 197));
	//	pSouth.setBackground(new Color(218, 215, 197));
	//	pWest.setBackground(new Color(218, 215, 197));

		
		add(pNorth);
		add(pCenter);
	//	add(pEast);
	//	add(pSouth);
	//	add(pWest);
	
		add(homePanel.getpNorth(), BorderLayout.NORTH);
        add(homePanel.getHomePanel(), BorderLayout.CENTER);
		
	}
	
	/**
	 * Remove both panels then determine which one to display.
	 * 	
	 * @param whichPanel
	 */
	public void displayPanel(int whichPanel) {
		remove(homePanel.getpNorth()); 
	    remove(homePanel.getHomePanel());
	    remove(boardPanel.getpNorth());
	    remove(boardPanel.getBoardPanel());
	    if (whichPanel == 1) {
	    	add(homePanel.getpNorth(), BorderLayout.NORTH);
	        add(homePanel.getHomePanel(), BorderLayout.CENTER);
	        } else {
	        	add(boardPanel.getpNorth(), BorderLayout.NORTH);
	            add(boardPanel.getBoardPanel(), BorderLayout.CENTER);
	       }
	       validate();
	       repaint();
	   }
	public void update(){
		validate();
		repaint();
	}
	/**
     * Register the controller as the listener to the panel switching
	 * 
	 * @param listener
	 */
	public void register(PanelSwitcherController listener){
			boardPanel.getButton().addActionListener(listener);
			homePanel.getButton1().addActionListener(listener);
			homePanel.getButton2().addActionListener(listener);		
		}
}