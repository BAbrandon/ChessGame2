package ChessGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;
/**
 * The SpotListener class implements Action Listener.
 * 
 * 
 * Created by Brandon on 11/29/2016 at 3:00AM
 *
 */
public class SpotListener implements ActionListener{
    private Board myboard;
    private JButton myPanelboard[][];
    private ChessPiece chessboard[][];
    private Player p1;
    private int fromX, fromY,toX,toY;
    boolean fp;
    ChessView myView;
    
    /**
     * constructor:
     * 
     * @param b
     * @param chessView
     */
    public SpotListener(Board b, ChessView chessView){
        myboard = b;
        myPanelboard = myboard.getPanelBoard();
        chessboard = myboard.getChessboard();
        fromX = 0;
        fromY = 0;
        toX = 0;
        toY = 0;
        fp = false;
        myView = chessView;
    }

    /**
     * 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        fp = false;
        for(int i = 0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                    if (e.getSource() == myPanelboard[i][j]) {
                        myView.setCords(i,j);
                        System.out.println("clicky click");
                    }
            }
        }
        //System.out.println(""+fromX+" "+fromY+"  "+toX+" "+toY);
       // if (myboard.getPiece(fromX, fromY).isValid(myboard, fromX, fromY, toX, toY)) {
       //     myboard.getChessboard()[toX][toY] = chessboard[fromX][fromY];
        //    myPanelboard[toX][toY] = myPanelboard[fromX][fromY];
        //}

    }
}