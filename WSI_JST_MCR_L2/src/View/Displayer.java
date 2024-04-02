package View;

import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public interface Displayer
{
    // region Public methode
    int getWidth();
    int getHeight();
    Graphics2D getGraphics();
    void repaint();
    void setTitle(String title);
    void addKeyListener(KeyAdapter ka);
    // endregion
}
