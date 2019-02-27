package ChessGame;

/**
 * The Knight class extends the ChessPiece class.
 * Define and check movement of piece.
 * 
 * Created by Brandon on 11/25/2016.
 */
public class Knight extends ChessPiece {
	
	/**
	 * constructor: Define the Knight piece
	 * 
	 * @param name
	 * @param c
	 * @param pic
	 */
    public Knight(String name,int c, String pic){
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

            if (toX != fromX - 1 && toX != fromX + 1 && toX != fromX + 2 && toX != fromX - 2)
                return false;
            if (toY != fromY - 2 && toY != fromY + 2 && toY != fromY - 1 && toY != fromY + 1)
                return false;

            return true;
        }
        return false;
    }
}