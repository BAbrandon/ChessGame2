package ChessGame;

import javax.swing.*;

/**
 * The Player class determines which color is the player.
 * 
 * @author Tyler and Brandon
 *
 */
public class Player {
	private Board board;
	private int color;
	private ChessPiece chessboard[][];
	
	/**
	 * constructor: Player color 
	 * 
	 * @param c
	 */
	public Player(int c) {
		color =c;
	}	

	/**
	 * move players piece.
	 * 
	 * @param board
	 * @param fromX
	 * @param fromY
	 * @param toX
	 * @param toY
	 * @return
	 */
	public boolean movePiece(Board board, int fromX, int fromY, int toX, int toY) {

		//System.out.println("movePiece got called");
		JButton myPanelBoard[][];
		ChessPiece piece;
		if(fromX == -1 ||fromY == -1||toX == -1 ||toY == -1) {
			return false;
		}
		piece = board.getPiece(fromX, fromY);

		System.out.println(piece+"       "+color);
		if (color == piece.getMyColor()) {
			System.out.println("was my color");
			if (piece.isValid(board, fromX, fromY, toX, toY)) {
				chessboard = board.getChessboard();
				chessboard[toX][toY] = chessboard[fromX][fromY];
				chessboard[fromX][fromY] = new NullSpot("null",-1,"transparent.png");
				System.out.println("is valid worked");
				myPanelBoard = board.getPanelBoard();
				myPanelBoard[toX][toY] = myPanelBoard[fromX][fromY];
				JButton b= new JButton();
				b.add(new NullSpot("null", -1, "transparent.png").getMyLabel());
				myPanelBoard[fromX][fromY] = b;
				return true;
			} else{
				return false;
			}
		}
		return false;
	}
}