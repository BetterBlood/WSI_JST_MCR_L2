package Shape.Renderer;

import Shape.Bouncable;

import java.awt.Graphics2D;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the Renderer interface.
 * @Info        : Represents an interface for rendering shapes.
 * -----------------------------------------------------------------------------------
 **/

public interface Renderer {
    // region Public methode
    /**
     * @brief Displays the given shape using the provided graphics context.
     * @param g The graphics context.
     * @param b The shape to display.
     */
    void display(Graphics2D g, Bouncable b);
    // endregion
}

