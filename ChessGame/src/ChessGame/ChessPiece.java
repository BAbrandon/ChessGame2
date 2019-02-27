package ChessGame;

import javax.swing.*;
import java.awt.*;

/**
 * The Chesspiece class determines the color and location of the piece. Also, if the piece is active or not
 * 
 * Created by Brandon on 11/24/2016.
 */
public class ChessPiece {
	
    private JLabel myLabel;
    private int myColor;
    private boolean active;
    
    /**
     *  constructor: Chess piece information
     *  
     * @param name
     * @param c
     * @param pic
     */
    public ChessPiece(String name,int c, String pic){
        Icon i = new ImageIcon(getClass().getResource(pic));
        myLabel = new JLabel(name, JLabel.CENTER);
        myLabel.setBackground(Color.white);
        myLabel.setOpaque(true);
        myLabel = new JLabel(i, JLabel.CENTER);
        myColor = c;
        active = true;
    }

    /**
     * return myColor
     * 
     * @return
     */
    public int getMyColor(){
        return myColor;
    }

    /**
     * return myLabel
     * 
     * @return
     */
    public JLabel getMyLabel(){
        return myLabel;
    }
    
    /**
     * return active
     * 
     * @return
     */
    public boolean isActive(){return active;}
    
    /**
     * return code for active
     * 
     * @param a
     */
    public void setActive(boolean a ){active = a;}

    /**
     * check if move is valid
     * 
     * @param board
     * @param fromX
     * @param fromY
     * @param toX
     * @param toY
     * @return
     */
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY){
        if(toX == fromX && toY == fromY)
            return false; //cannot move nothing
        if(toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY <0 || fromY > 7)
            return false; // error trapping
        return true;
    }
    
    /**
     * movement of the piece
     * 
     * @param board
     * @param i
     * @param j
     */
	public void move(Board board, int i, int j) {
		// TODO Auto-generated method stub		
	}
}