package Shape.Full;

import Shape.Renderer.FullRenderer;
import Shape.Square;
import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public class FullSquare extends Square {
    public FullSquare() {
        super();
        renderer = FullRenderer.getInstance();
    }

    @Override
    public Color getColor() {
        return Color.ORANGE;
    }
}
