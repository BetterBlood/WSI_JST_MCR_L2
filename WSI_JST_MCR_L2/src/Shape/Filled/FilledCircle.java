package Shape.Filled;

import Shape.Circle;
import Shape.Renderer.FilledRenderer;

import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the FilledCircle class.
 * @Info        : Represents a filled circle shape.
 * -----------------------------------------------------------------------------------
 **/

public class FilledCircle extends Circle {
    // region Ctor
    /**
     * @brief Constructs a new instance of the FilledCircle class.
     */
    public FilledCircle() {
        super();
        renderer = FilledRenderer.getInstance();
    }
    // endregion

    // region Public methode
    /**
     * @brief Gets the color of the FilledCircle.
     * @return The color of the FilledCircle.
     */
    @Override
    public Color getColor() {
        return Color.BLUE;
    }
    // endregion
}
