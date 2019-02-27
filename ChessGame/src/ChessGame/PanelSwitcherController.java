package ChessGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * PanelSwitcherController class implements Action Listener.
 * Conrols the action of two buttons on the home panel and one button on the board panel.
 * 
 * @author Nichele
 *
 */
public class PanelSwitcherController implements ActionListener {
	
	/** 
	 * The model of this panelswitcher 
	 */
	private PanelSwitcherModel model;
	
	/** 
	 * The view of this panelswitcher 
	 */
	private PanelSwitcherView view;
	
	
	/**
	 * constructor:
	 * 
	 * @param view
	 * @param model
	 */
	public PanelSwitcherController(PanelSwitcherView view,PanelSwitcherModel model) {
		this.model = model;
		this.view = view;
	}
	
	/**
	 * Switch between panels when button is pressed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("1 Player")) {
			Sound.ONEPLAY.play();
			model.switchPanel();
			int switched = model.whichPanel();
			view.displayPanel(switched);
			
		} else if (command.equals("2 Player")) {
			Sound.TWOPLAY.play();
			model.switchPanel();
			int switched = model.whichPanel();
			view.displayPanel(switched);
				
		} else if  (command.equals("Home")) {
			model.switchPanel();
			int switched = model.whichPanel();
			view.displayPanel(switched);			
		}		
	}
}