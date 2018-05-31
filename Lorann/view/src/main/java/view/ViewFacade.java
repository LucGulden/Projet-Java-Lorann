package view;

import javax.swing.*;

import controller.IController;

import java.awt.*;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 */
public class ViewFacade implements IView {

    private final CustomJFrame window;
    private IController controller;

    int score = 0;

    /**
     * CONSTRUCTOR
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        window = new CustomJFrame();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    /**** GETTERS and SETTERS ****/
    public void setController(IController controller) {
        this.controller = controller;
    }

    /**** METHODS ****/
    public final void run() {

    }

    public void showElements() {
        window.add(new CustomJPanel(controller.getImageMap(),score));
        window.revalidate();
    }
    
    //Return UserInputDeplacement
    public Point return_deplacement_player() {
    	return window.return_deplacement_player();
    }
    
    // Return UserInputCastingSpell
    public boolean return_casting_player() {
    	return window.return_casting_player();
    }

    /*Set the score*/
    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
}
