package ChessGame;

/**
 * The Rook class extends the ChessPiece class.
 * Define and check movement of piece.
 * 
 * Created by Brandon on 11/25/2016.
 */
public class Rook extends ChessPiece {
	
	/**
	 * constructor: Define the Rook piece
	 * 
	 * @param name
	 * @param c
	 * @param pic
	 */
    public Rook(String name, int c, String pic){
        super(name,c,pic);

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
        if(board.getPiece(toX,toY).getMyColor() != getMyColor() || board.getPiece(toX,toY).equals(new NullSpot("null",-1,"null.png"))) {
            if (super.isValid(board, fromX, fromY, toX, toY) == false)
                return false;
            if (toX == fromX && toY != fromY) {
                for (int i = fromY; i <= toY; i++) {
                    if (board.getPiece(fromX, i) == null) {
                        return true;
                    } else
                        return false;
                }
                return false;
            }
            if (toY == fromY && toX != fromX) {
                for (int i = fromX; i <= toX; i++) {
                    if (board.getPiece(i, fromY) == null) {
                        return true;
                    } else
                        return false;
                }
                return false;
            }
        }
        return false;
    }
}