package ChessGame;

/**
 * PanelSwitcherModel class determines which panel is displayed and then switches to 
 * the other panel, which is between the home & board panel.
 * 
 * @author Nichele
 *
 */
public class PanelSwitcherModel {
    /**
     * Either 1 or 2 is stored in panel.
     */
    private int panel;

    /**
     * constructor: assign 1 to panel
     */
    public PanelSwitcherModel() {
        panel = 1;
    }

    /**
     * the value of panel is returned.
     * 
     * @return 
     */
    public int whichPanel() {
        return panel;
    }

    /**
     * Switch panel from 1 to 2 or from 2 to 1, but not from any other number
     * any other number.
     */
    public void switchPanel() {
        if (panel == 1)
            panel = 2;
        else
            panel = 1;
    }
}