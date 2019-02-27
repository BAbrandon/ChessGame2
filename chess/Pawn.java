package ChessGame;

/**
 * The Pawn class extends the ChessPiece class.
 * Define and check movement of piece.
 * 
 * Created by Brandon on 11/25/2016.
 */
public class Pawn extends ChessPiece{
    private int moveCounter;
    
    /**
     * constructor: Define the Pawn piece
     * 
     * @param name
     * @param c
     * @param pic
     */
    public Pawn(String name,int c, String pic){
        super(name,c,pic);
        moveCounter = 0;
    }
    
    /**
     * the move of the piece
     */
    public void move(Board board, int toX, int toY) {

    }
    
    /**
     * check if location to move to is Valid
     */
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        return true;
      //  if (board.getPiece(toX, toY).getMyColor() != getMyColor() || board.getPiece(toX, toY).equals(new NullSpot("null", -1, "null.png"))) {
            /*
            if (super.isValid(board, fromX, fromY, toX, toY) == false)
                return false;
            if (moveCounter <= 0 && fromX == toX && toY == fromY + 1)
                return true;
            if(moveCounter == 0 && fromX == toX && toY == fromY + 2 ) {
                if (board.getPiece(fromX + 1, fromY + 1).equals(board.getPiece(toX,toY).equals(new NullSpot("null",-1,"null.png"))))
                    return true;
           }
        }
        return false;
        */
        //}
    }
}