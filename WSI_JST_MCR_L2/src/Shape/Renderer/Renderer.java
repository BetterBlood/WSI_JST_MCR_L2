package Shape.Renderer;

import Shape.Bouncable;

import java.awt.Graphics2D;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public interface Renderer {
    // region Public methode
    void display(Graphics2D g, Bouncable b);
    // endregion
}

