package ChessGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class defines the board view, gets the location of the pieces, & determines 
 * if the piece is black or white.
 * 
 * @author briannabrumfield and Brandon
 * Created by Brandon on 11/25/2016.
 */
public class Board {
    private JButton myPanelboard[][];
    private ChessPiece chessboard[][];
    
    /**
     * constructor: defines each place on chess board as a button and the location
     * 
     * @param chessView
     */
    public Board(ChessView chessView){
        myPanelboard = new JButton[8][8];
        chessboard = new ChessPiece[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                myPanelboard[i][j] = new JButton();
                myPanelboard[i][j].addActionListener(new SpotListener(this, chessView));
                myPanelboard[i][j].add(new NullSpot("null",-1,"transparent.png").getMyLabel());
                chessboard[i][j] = new NullSpot("null",-1,"transparent.png");
                if ((i + j) % 2 == 0) {
                    myPanelboard[i][j].setBackground(Color.DARK_GRAY);
                } else {
                    myPanelboard[i][j].setBackground(Color.WHITE);
                }
                addPiece(myPanelboard,chessboard, i, j);
            }
        }

    }

    /**
     * gets piece to check and return if null or return location
     * 
     * @param i
     * @param j
     * @return
     */
    public ChessPiece getPiece(int i,int j){
        if(chessboard[i][j] == null)
            return null;
        return chessboard[i][j];
    }
    public void setMyPanelboard(JButton board[][]){
        myPanelboard = board;
    }
    /**
     * returns myPanelboard
     * 
     * @return
     */
    public JButton[][] getPanelBoard(){
        return myPanelboard;
    }
    
    /**
     * returns chessboard
     * 
     * @return
     */
    public ChessPiece[][] getChessboard(){
        return chessboard;
    }

    /**
     * adds pieces, checks if black or white, and individual piece
     * 
     * @param pBoard
     * @param cBoard
     * @param i
     * @param j
     */
    public void addPiece(JButton pBoard[][],ChessPiece cBoard[][], int i, int j){
        // determine if a black piece
        BlackPieces black = new BlackPieces();
        if(i == 0 || i == 1){
            if(i == 1){ // its a pawn
                pBoard[i][j].add(black.getPawn().getMyLabel());
                cBoard[i][j] = black.getPawn();
            } else if (j == 0 || j == 7){ // it's a rook
                pBoard[i][j].add(black.getRook().getMyLabel());
                cBoard[i][j] = black.getRook();
            }else if (j == 1 || j == 6){ // it's a knight
                pBoard[i][j].add(black.getKnight().getMyLabel());
                cBoard[i][j] = black.getKnight();
            }else if (j == 2 || j == 5){ // it's a bishop
                pBoard[i][j].add(black.getBishop().getMyLabel());
                cBoard[i][j] = black.getBishop();
            }else if (j == 3){ // it's a queen
                pBoard[i][j].add(black.getQueen().getMyLabel());
                cBoard[i][j] = black.getQueen();
            }else if (j == 4){ // it's a king
                pBoard[i][j].add(black.getKing().getMyLabel());
                cBoard[i][j] = black.getKing();
            }

        }else if(i == 6 || i == 7) //determine if a white piece
        {
            WhitePieces white = new WhitePieces();
            if(i == 6){ // its a pawn
                pBoard[i][j].add(white.getPawn().getMyLabel());
                cBoard[i][j] = white.getPawn();
            } else if (j == 0 || j == 7){ // it's a rook
                pBoard[i][j].add(white.getRook().getMyLabel());
                cBoard[i][j] = white.getRook();
            }else if (j == 1 || j == 6){ // it's a knight
                pBoard[i][j].add(white.getKnight().getMyLabel());
                cBoard[i][j] = white.getKnight();
            }else if (j == 2 || j == 5){ // it's a bishop
                pBoard[i][j].add(white.getBishop().getMyLabel());
                cBoard[i][j] = white.getBishop();
            }else if (j == 3){ // it's a queen
                pBoard[i][j].add(white.getQueen().getMyLabel());
                cBoard[i][j] = white.getQueen();
            }else if (j == 4){ // it's a king
                pBoard[i][j].add(white.getKing().getMyLabel());
                cBoard[i][j] = white.getKing();
            }

        }
    }
    
    /**
     * Determines what to do with the event generated by the GUI.
     * 
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());

    }
    
    /**
     * Determines what to do with the event generated by the GUI.
     * 
     * @param e
     */
    public void actionListener(ActionEvent e){}

    public void movePiece(Board board, int fromX, int fromY, int toX, int toY){
        ChessPiece myPiece = board.getPiece(fromX, fromY);
        JButton myPanelboard[][] = board.getPanelBoard();
        ChessPiece chessboard[][] = board.getChessboard();
        myPanelboard[toX][toY].add(myPiece.getMyLabel());
        chessboard[toX][toY] = myPiece;
    }
}
