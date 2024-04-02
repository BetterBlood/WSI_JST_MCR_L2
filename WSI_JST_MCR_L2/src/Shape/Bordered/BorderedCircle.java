package Shape.Bordered;

import Shape.Circle;
import Shape.Renderer.BorderedRenderer;

import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public class BorderedCircle extends Circle {
    // region Ctor
    public BorderedCircle() {
        super();
        renderer = BorderedRenderer.getInstance();
    }
    // endregion

    // region Public methode
    @Override
    public Color getColor() {
        return Color.GREEN;
    }
    // endregion
}
