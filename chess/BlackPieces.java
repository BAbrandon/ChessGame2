package ChessGame;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * The BlackPieces class is in charge of holding and returning 
 * the images of black chess pieces
 * 
 * @author Nichele and Brandon
 *
 */
public class BlackPieces {

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
	private NullSpot nullSpot;
	
	/**
	 * constructor: define the different types of black pieces
	 */
	public BlackPieces() {
		// Pawn
		pawn = new Pawn("Pawn",1,"blackPawn.png");
		//Knight
		knight = new Knight("Knight",1,"blackKnight.png");
		// Bishop
		bishop = new Bishop("Bishop",1,"blackBishop.png");
		// Rook
		rook = new Rook("Rook",1,"blackRook.png");
		//queen
		queen = new Queen("Queen",1,"blackQueen.png");
		// King
		king = new King("King",1,"blackKing.png");
		nullSpot = new NullSpot("null",-1,"null.png");
	}
	
	/*
	 * null spot
	 */
	public ChessPiece getNull() {
		return nullSpot;
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