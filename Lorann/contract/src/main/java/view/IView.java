package view;

import java.awt.Point;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {

    void showElements();
    void displayMessage(String message);
    Point return_deplacement_player();
    boolean return_casting_player();
}
