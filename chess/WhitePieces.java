package ChessGame;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * The WhitePieces class is in charge of holding and returning 
 * the images of white chess pieces
 * 
 * @author Nichele and Brandon
 *
 */
public class WhitePieces {

	// pawn piece
	private Pawn pawn;
	// knight piece
	private Knight knight;
	// bishop piece
	private Bishop bishop;
	// rook piece
	private Rook rook;
	// queen piece
	private Queen queen;
	// king piece
	private King king;

	/**
	 * constructor: define the different types of white pieces
	 */
	public WhitePieces() {
		// Pawn
		pawn = new Pawn("Pawn",0,"whitePawn.png");
		//Knight
		knight = new Knight("Knight",0,"whiteKnight.png");
		// Bishop
		bishop = new Bishop("Bishop",0,"whiteBishop.png");
		// Rook
		rook = new Rook("Rook",0,"whiteRook.png");
		//queen
		queen = new Queen("Queen",0,"whiteQueen.png");
		// King
		king = new King("King",0,"whiteKing.png");
	}

	/**
	 * return pawn
	 * 
	 * @return
	 */
	public ChessPiece getPawn() {
		return pawn;
	}

	/**
	 * return knight
	 * 
	 * @return
	 */
	public ChessPiece getKnight() {
		return knight;
	}

	/**
	 * return bishop
	 * 
	 * @return
	 */
	public ChessPiece getBishop() {
		return bishop;
	}

	/**
	 * return rook
	 * 
	 * @return
	 */
	public ChessPiece getRook() {
		return rook;
	}

	/** 
	 * return queen
	 * 
	 * @return
	 */
	public ChessPiece getQueen() {
		return queen;
	}

	/**
	 * return king
	 * 
	 * @return
	 */
	public ChessPiece getKing() {
		return king;
	}
}