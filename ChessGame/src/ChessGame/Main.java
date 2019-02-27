package ChessGame;

import javax.swing.JFrame;

/**
 * Main Class start of Chess game.
 * 
 * @author briannabrumfield
 */
public class Main {

	public static void main(String[] args) {
		ChessView chessFrame = new ChessView();
		ChessViewHome chessHome = new ChessViewHome();
		PanelSwitcherModel model = new PanelSwitcherModel();
		PanelSwitcherView switcher = new PanelSwitcherView(chessFrame,chessHome);
	    PanelSwitcherController controller = new PanelSwitcherController(switcher, model);
		switcher.register(controller);
		switcher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		switcher.setSize(1000, 800); // set frame size
		switcher.setVisible(true);      
	}
}