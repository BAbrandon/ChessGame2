package ChessGame;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.*;
import javax.swing.*;

/**
 * ChessGame class extends JFrame, impements Runnable, MouseListener, MouseMotionListener.
 * Design the layout of the chess board panel.
 *
 * @author briannabrumfield, gloria, nichele, and tyler
 */
public class ChessView extends JFrame implements Runnable, MouseListener, MouseMotionListener{

	private JPanel boardPanel, pNorth, pCenter, pEast, board[][];
	private JButton button;
	private JLabel playerLabel;
	private String string;
	private Board myBoard;
	private MouseListener mouseList;
	private PanelSwitcherView myPanelSwitcherView;
	private int fromX,fromY,toX,toY;
	private boolean from, set;
	private boolean play;
	Player p1;
	Player p2;

	/**
	 * constructor: board panel view
	 */
	public ChessView() {
		super("Section 1 Team 1: Chess Game!");

		/**\
		 * create board
		 */
		fromX=fromY=toX=toY = -1;
		from = false;
		play = true;
		set = false;
		myBoard = new Board(this);

		p1 = new Player(1);
		p2 = new Player(0);



		boardPanel = new JPanel();
		boardPanel.setLayout(new BorderLayout());

		pNorth = new JPanel();
	    pCenter = new JPanel();
		pEast = new JPanel();
	//	JPanel pWest = new JPanel();
	//	JPanel pSouth = new JPanel();

		add(pCenter, BorderLayout.CENTER);
		add(pNorth, BorderLayout.NORTH);
		add(pEast, BorderLayout.EAST);
	//	add(pSouth, BorderLayout.SOUTH);
	//	add(pWest, BorderLayout.WEST);

		/**
		 * set colors for each panel
		 */
		pNorth.setBackground(new Color(218, 215, 197));
		pCenter.setBackground(new Color(218, 215, 197));
		pEast.setBackground(new Color(218, 215, 197));
    //	pSouth.setBackground(new Color(218, 215, 197));
	//	pWest.setBackground(new Color(218, 215, 197));


		/**
		 * CENTER LAYOUT pCenter will have
		 */
		pCenter.setSize(800, 800);

		pCenter.setLayout(new GridLayout(8, 8));

		/**
		 * add the JPanels from the board
		 *
 		 */
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				pCenter.add(myBoard.getPanelBoard()[i][j]);
				myBoard.getPanelBoard()[i][j].addMouseListener(mouseList);
			}
		}

		boardPanel.add(pCenter, BorderLayout.CENTER);
		
		/**
		 * NORTH LAYOUT
		 */

		pNorth.setLayout(new GridLayout(1, 5));

		// Home
		button = new JButton("Home");
		button.setOpaque(true);
		button.setBackground(new Color(218, 215, 197));
		pNorth.add(button);

		/**
		 * This button will be a link to a webpage with a detailed explanation
		 * on how to play chess.
		 */
		// RULES
		JButton button3 = new JButton("Rules");
		button3.setOpaque(true);
		button3.setBackground(new Color(218, 215, 197));
		pNorth.add(button3);
		ButtonHandler handler3 = new ButtonHandler(button3);
		button3.addActionListener(handler3);

		// CREDITS
		JButton button4 = new JButton("Credits");
		button4.setBackground(new Color(218, 215, 197));
		pNorth.add(button4);
		ButtonHandler handler4 = new ButtonHandler(button4);
		button4.addActionListener(handler4);
		
		//Player's turn panel
		boardPanel.add(pEast, BorderLayout.EAST);
		pEast.setSize(100,800);
		pEast.setLayout(new GridLayout(12,1));
		pEast.setBackground(new Color(218, 215, 197));
		string = "Player 1";
		String title = "<html>Current Player's Turn: <br><html>";
		String pstring = title + string;
		playerLabel = new JLabel(pstring);
		pEast.add(playerLabel, BorderLayout.CENTER);
		
		// End Turn Button
		JButton playerSwapBut = new JButton("End Turn");
		pEast.add(playerSwapBut, BorderLayout.CENTER);
		//ButtonHandler handler5 = new ButtonHandler(playerSwapBut);
		//playerSwapBut.addActionListener(handler5);
	}

	/*
	 * Returns the game board panel
	 */
	public void reDraw(){
		JPanel pCenter2= new JPanel();
		pCenter.removeAll();
		pCenter.revalidate();
		pCenter.repaint();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				//pCenter2.setSize(800, 800);
				//pCenter2.setLayout(new GridLayout(8, 8));
				add(pCenter, BorderLayout.CENTER);
				JButton newPanelboard[][] = new JButton[8][8];;
				newPanelboard[i][j] = new JButton();
				//myBoard.getPanelBoard()[i][j].addMouseListener(mouseList);
				newPanelboard[i][j].addMouseListener(mouseList);

				if ((i + j) % 2 == 0) {
					newPanelboard[i][j].setBackground(Color.DARK_GRAY);
				} else {
					newPanelboard[i][j].setBackground(Color.WHITE);
				}
				newPanelboard[i][j].add(myBoard.getChessboard()[i][j].getMyLabel());
				myBoard.setMyPanelboard(newPanelboard);
				newPanelboard[i][j].addActionListener(new SpotListener(myBoard, this));
				pCenter.add(newPanelboard[i][j]);
				System.out.print(myBoard.getChessboard()[i][j].getMyName().substring(0,1)+"");
	}
	System.out.println();
}

		boardPanel.add(pCenter, BorderLayout.CENTER);


	}
	public JPanel getBoardPanel() {
		return boardPanel;
	}

	/*
	 * Returns the pNorth panel with the buttons
	 */
	public JPanel getpNorth() {
		return pNorth;
	}
	
	/*
	 * Returns the home button
	 */
	public JButton getButton() {
		return button;
	}

	/*
	 * update Board
	 */
	public void updateBoard(Board b){
		myBoard = b;
	}
	public void setPanelSwitcher(PanelSwitcherView view){
		myPanelSwitcherView = view;
	}
	/*
	 * register listener
	 */
	public void registerListener(ButtonHandler controller) {
		Component[] components = pNorth.getComponents();
		for(Component component : components) {
			if(component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller);
			}
		}
	}

	/*
	 * switch player
	 */
	public void switchPlayer() {
		if(string.equals("Player 1")) {
			string = "Player 2";
		}else {
			string = "Palyer 1";
		}		
	}
	
	/**
	 * run method
	 */
	public void run(){
		if(play){
			System.out.println("player1\n\n\n turn");
			if (p1.movePiece(myBoard, fromX, fromY, toX, toY)) {
				fromX = fromY = toX = toY = -1;
				play = false;
				set = false;
				//System.out.println("The Piece i moved was"+myBoard.getPiece(toX,toY));
			}
		}else{
			System.out.println("player2\n\n\n\n");
			if(p2.movePiece(myBoard,fromX,fromY,toX,toY)){
				fromX = fromY = toX = toY = -1;
				play = true;
				myPanelSwitcherView.update();
			}
		}
	}

	/**
	 * mouse Entered
	 */
	public void mouseEntered(MouseEvent e) {}

	/**
	 * mouse Exited
	 */
	public void mouseExited(MouseEvent e) {}
	
	/**
	 * mouse Pressed
	 */
	public void mousePressed(MouseEvent e) {}
	
	/**
	 * mouse Released
	 */
	public void mouseReleased(MouseEvent e) {}
	
	/**
	 * mouse Clicked
	 */
	public void mouseClicked(MouseEvent e){
		System.out.println(e.getSource());
	}
	
	/**
	 * mouse Dragged
	 */
	public void mouseDragged(MouseEvent e) {}
	
	/**
	 * mouse Moved
	 */
	public void mouseMoved(MouseEvent e) {}
	
	/**
	 * 
	 */
	public void setCords(int x, int y){
		String title = "<html>Current Player's Turn: <br><html>";


		if(!from){
		fromX = x;
		fromY = y;
		from = true;
	}else{
		toX = x;
		toY = y;
		from = false;
		if(play){
			System.out.println("player1");
			playerLabel.setText(title+"Player 2");
			if (p1.movePiece(myBoard, fromX, fromY, toX, toY)) {

				play = false;
				set = false;
				//System.out.println("The Piece i moved was"+myBoard.getPiece(toX,toY));
				//System.out.println("fuckme");
				myPanelSwitcherView.update();
				System.out.println("" + fromX + " " + fromY + "  " + toX + " " + toY);
				pCenter.removeAll();
				reDraw();
				pCenter.revalidate();
				pCenter.repaint();
				fromX = fromY = toX = toY = -1;
			}
		}else{
			playerLabel.setText(title+"Player 1");

			System.out.println("player2");
			if(p2.movePiece(myBoard,fromX,fromY,toX,toY)){

				play = true;
				//System.out.println("The Piece i moved was"+myBoard.getPiece(toX,toY));
				//System.out.println("" + fromX + " " + fromY + "  " + toX + " " + toY);
				pCenter.removeAll();
				reDraw();
				pCenter.revalidate();
				pCenter.repaint();
				fromX = fromY = toX = toY = -1;

			}
		}
	}
		System.out.println(""+fromX+" "+fromY+"  "+toX+" "+toY);
	}
}