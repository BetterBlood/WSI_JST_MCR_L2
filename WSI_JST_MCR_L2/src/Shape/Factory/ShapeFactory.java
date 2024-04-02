package Shape.Factory;

import Shape.Circle;
import Shape.Square;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the ShapeFactory abstract class.
 * @Info        : Represents an abstract factory for creating shapes.
 * -----------------------------------------------------------------------------------
 **/

public abstract class ShapeFactory {
    // region Public methode
    /**
     * @brief Creates a new circle.
     * @return The created circle.
     */
    public abstract Circle createCircle();

    /**
     * @brief Creates a new square.
     * @return The created square.
     */
    public abstract Square createSquare();
    // endregion
}
