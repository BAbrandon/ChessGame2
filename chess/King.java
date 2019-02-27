package ChessGame;

/**
 * The King class extends the ChessPiece class.
 * Define and check movement of piece.
 *  
 * Created by Brandon on 11/25/2016.
 */
public class King extends ChessPiece{
	
	/**
	 * constructor: Define the King piece
	 *  
	 * @param name
	 * @param c
	 * @param pic
	 */
    public King(String name,int c, String pic){
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
        if (board.getPiece(toX, toY).getMyColor() != getMyColor() || board.getPiece(toX,toY).equals(new NullSpot("null",-1,"null.png"))) {
            if (super.isValid(board, fromX, fromY, toX, toY) == false)
                return false;
            if (Math.sqrt(Math.pow(Math.abs((toX - fromX)), 2)) + Math.pow(Math.abs((toY - fromY)), 2) != Math.sqrt(2)) {
                return false;
            }
            return false;
        }
        return false;
    }
}