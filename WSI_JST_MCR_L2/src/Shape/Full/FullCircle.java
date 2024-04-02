package Shape.Full;

import Shape.Circle;
import Shape.Renderer.FullRenderer;

import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public class FullCircle extends Circle {
    // region Ctor
    public FullCircle() {
        super();
        renderer = FullRenderer.getInstance();
    }
    // endregion

    // region Public methode
    @Override
    public Color getColor() {
        return Color.BLUE;
    }
    // endregion
}
