package ChessGame;

/**
 * The NullSpot class extends the ChessPiece class.
 * 
 * Created by Brandon on 11/29/2016.
 */
public class NullSpot extends ChessPiece {

	/**
	 * constructor: Null Spot "piece"
	 * 
	 * @param name
	 * @param c
	 * @param pic
	 */
    public NullSpot(String name, int c, String pic) {
        super(name, c, pic);
    }
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY){return false;}
}
