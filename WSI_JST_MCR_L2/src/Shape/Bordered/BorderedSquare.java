package Shape.Bordered;

import Shape.Renderer.BorderedRenderer;
import Shape.Square;
import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the BorderedSquare class.
 * @Info        : Represents a bordered square shape.
 * -----------------------------------------------------------------------------------
 **/

public class BorderedSquare extends Square {
    // region Ctor
    /**
     * @brief Constructs a new instance of the BorderedSquare class.
     */
    public BorderedSquare() {
        super();
        renderer = BorderedRenderer.getInstance();
    }
    // endregion

    // region Public methode
    /**
     * @brief Gets the color of the BorderedSquare.
     * @return The color of the BorderedSquare.
     */
    @Override
    public Color getColor() {
        return Color.RED;
    }
    // endregion
}
