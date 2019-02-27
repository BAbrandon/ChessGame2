package ChessGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * ChessviewHome class extends Jframe. Design the homepage panel.
 *
 * Created by Nichele
 */
public class ChessViewHome extends JFrame{
	
	private JPanel homePanel, pNorth, pCenter;
	private JButton button1, button2, button3, button4;

	/**
	 * Constructor: Creates the chess homepage
	 */
	/**
	 * 
	 */
	public ChessViewHome() {
		super("Section 1 Team 1: Chess Game!");
		
		Font font = new Font("SansSerif", Font.BOLD, 96);
		homePanel = new JPanel();
		homePanel.setLayout(new BorderLayout());

		pNorth = new JPanel();
		pCenter = new JPanel();
	//	JPanel pWest = new JPanel();
	//	JPanel pEast = new JPanel();
	//	JPanel pSouth = new JPanel();

		homePanel.add(pCenter, BorderLayout.CENTER);
		homePanel.add(pNorth, BorderLayout.NORTH);
	//	homePanel.add(pEast, BorderLayout.EAST);
	//	homePanel.add(pSouth, BorderLayout.SOUTH);
	//	homePanel.add(pWest, BorderLayout.WEST);

		/**
		 * set colors for each panel
		 */
		pNorth.setBackground(new Color(218, 215, 197));
		pCenter.setBackground(new Color(218, 215, 197));
	//	pEast.setBackground(new Color(218, 215, 197));
	//	pSouth.setBackground(new Color(218, 215, 197));
	//	pWest.setBackground(new Color(218, 215, 197));
		
		homePanel.add(pNorth);
		homePanel.add(pCenter);
	//	homePanel.add(pEast);
	//	homePanel.add(pSouth);
	//	homePanel.add(pWest);

		/**
		 * North LAYOUT
		 */
		
		Icon chess = new ImageIcon(getClass().getResource("chess.png")); // create an icon to display
		JLabel label = new JLabel(chess, JLabel.CENTER);
        label.setBackground(new Color(218, 215, 197));
        label.setFont(font);
        label.setOpaque(true);
        homePanel.add(label, BorderLayout.NORTH);
		
		/**
		 * Center LAYOUT
		 */

		pCenter.setLayout(new GridLayout(4, 1));
		
		// PLAYER1
		Icon chesspiece1 = new ImageIcon(getClass().getResource("chesspiece1.png")); // create an icon to display
		button1 = new JButton("1 Player",chesspiece1);
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setVerticalTextPosition(JButton.BOTTOM);
		button1.setActionCommand("1 Player");
		button1.setOpaque(true);
		button1.setBackground(new Color(218, 215, 197));
		pCenter.add(button1);

		// PLAYER2
		Icon twoplayer = new ImageIcon(getClass().getResource("twoplayer.png")); // create an icon to display
		button2 = new JButton("2 Player", twoplayer);
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setVerticalTextPosition(JButton.BOTTOM);
		button2.setActionCommand("2 Player");
		button2.setOpaque(true);
		button2.setBackground(new Color(218, 215, 197));
		pCenter.add(button2);

		/**
		 * This button will be a link to a webpage with a detailed explanation
		 * on how to play chess.
		 */
		// RULES
		Icon RName = new ImageIcon(getClass().getResource("rules.png"));
		button3 = new JButton(RName);
		button3.setActionCommand("Rules");
		button3.setOpaque(true);
		button3.setBackground(new Color(218, 215, 197));
		pCenter.add(button3);
		ButtonHandler handler3 = new ButtonHandler(button3);
		button3.addActionListener(handler3);

		// CREDITS
		Icon CName = new ImageIcon(getClass().getResource("credits.png"));
		button4 = new JButton(CName);
		button4.setActionCommand("Credits");
		button4.setOpaque(true);
		button4.setBackground(new Color(218, 215, 197));
		pCenter.add(button4);
		ButtonHandler handler4 = new ButtonHandler(button4);
		button4.addActionListener(handler4);
		
		homePanel.add(pCenter);		
	}
			
	/**
	 *  Returns the home panel
	 *  
	 * @return homePanel
	 */
	public JPanel getHomePanel() {
		return homePanel;
	}

	/**
	 * Returns the north panel 
	 * 
	 * @return pNorth
	 */
	public JPanel getpNorth() {
		return pNorth;
	}

	/**
	 * Returns the player 1 button
	 * 
	 * @return button1
	 */
	public JButton getButton1() {
		return button1;
	}

	/**
	 * Returns the player 2 button
	 * 
	 * @return button2
	 */
	public JButton getButton2() {
		return button2;
	}
}