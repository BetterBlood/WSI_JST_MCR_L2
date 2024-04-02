package Shape;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the Circle abstract class.
 * @Info        : Represents an abstract class for circle shapes.
 * -----------------------------------------------------------------------------------
 **/

public abstract class Circle extends CustomShape {
    // region Ctor
    /**
     * @brief Constructs a new instance of the Circle class.
     */
    public Circle() {
        super();
    }
    // endregion

    // region Public methode
    /**
     * @brief Gets the shape of the circle.
     * @return The shape of the circle.
     */
    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(position.getX(), position.getY(), size, size);
    }
    // endregion
}
