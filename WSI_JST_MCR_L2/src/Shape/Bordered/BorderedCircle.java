package Shape.Bordered;

import Shape.Circle;
import Shape.Renderer.BorderedRenderer;

import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the BorderedCircle class.
 * @Info        : Represents a bordered circle shape.
 * -----------------------------------------------------------------------------------
 **/

public class BorderedCircle extends Circle {
    // region Ctor
    /**
     * @brief Constructs a new instance of the BorderedCircle class.
     */
    public BorderedCircle() {
        super();
        renderer = BorderedRenderer.getInstance();
    }
    // endregion

    // region Public methode
    /**
     * @brief Gets the color of the BorderedCircle.
     * @return The color of the BorderedCircle.
     */
    @Override
    public Color getColor() {
        return Color.GREEN;
    }
    // endregion
}
