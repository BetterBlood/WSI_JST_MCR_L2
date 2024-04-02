package Shape.Filled;

import Shape.Renderer.FilledRenderer;
import Shape.Square;
import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the FilledSquare class.
 * @Info        : Represents a filled square shape.
 * -----------------------------------------------------------------------------------
 **/

public class FilledSquare extends Square {
    // region Ctor
    /**
     * @brief Constructs a new instance of the FilledSquare class.
     */
    public FilledSquare() {
        super();
        renderer = FilledRenderer.getInstance();
    }
    // endregion

    // region Public methode
    /**
     * @brief Gets the color of the FilledSquare.
     * @return The color of the FilledSquare.
     */
    @Override
    public Color getColor() {
        return Color.ORANGE;
    }
    // endregion
}
