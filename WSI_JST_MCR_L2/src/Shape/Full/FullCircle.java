package Shape.Full;

import Shape.Circle;
import Shape.Renderer.BorderedRenderer;
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
    public FullCircle() {
        super();
        renderer = new FullRenderer();
    }

    @Override
    public Color getColor() {
        return Color.BLUE;
    }
}
