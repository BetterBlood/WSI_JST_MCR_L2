package Shape;

import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the Bouncable interface.
 * @Info        : Represents an interface for objects that can bounce.
 * -----------------------------------------------------------------------------------
 **/

public interface Bouncable {
    // region Public methode
    /**
     * @brief Draws the object.
     */
    void draw();

    /**
     * @brief Moves the object.
     */
    void move();

    /**
     * @brief Gets the color of the object.
     * @return The color of the object.
     */
    Color getColor();

    /**
     * @brief Gets the shape of the object.
     * @return The shape of the object.
     */
    Shape getShape();
    // endregion
}