package Shape;

import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public interface Bouncable {
    // region Public methode
    void draw();
    void move();
    Color getColor();
    Shape getShape();
    // endregion
}