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
    void draw();
    void move();
    Color getColor();
    Shape getShape();
}