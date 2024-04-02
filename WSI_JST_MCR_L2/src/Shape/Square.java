package Shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the Square abstract class.
 * @Info        : Represents an abstract class for square shapes.
 * -----------------------------------------------------------------------------------
 **/

public abstract class Square extends CustomShape {
    // region Ctor
    /**
     * @brief Constructs a new instance of the Square class.
     */
    public Square() {
        super();
    }
    // endregion

    // region Public methode
    /**
     * @brief Gets the shape of the square.
     * @return The shape of the square.
     */
    @Override
    public final Shape getShape() {
        return new Rectangle2D.Double(position.getX(), position.getY(), size, size);
    }
    // endregion
}
