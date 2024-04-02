package Shape.Bordered;

import Shape.Renderer.BorderedRenderer;
import Shape.Square;
import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public class BorderedSquare extends Square {
    // region Ctor
    public BorderedSquare() {
        super();
        renderer = BorderedRenderer.getInstance();
    }
    // endregion

    // region Public methode
    @Override
    public Color getColor() {
        return Color.RED;
    }
    // endregion
}
