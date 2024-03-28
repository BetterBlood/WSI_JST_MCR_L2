package Shape.Bordered;

import Shape.Circle;
import Shape.Renderer.BorderedRenderer;

import java.awt.*;

public class BorderedCircle extends Circle {
    public BorderedCircle() {
        super();
        renderer = BorderedRenderer.getInstance();
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }

}
