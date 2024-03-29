package Shape.Bordered;

import Shape.Renderer.BorderedRenderer;
import Shape.Square;
import java.awt.*;

public class BorderedSquare extends Square {
    public BorderedSquare(){
        super();
        renderer = BorderedRenderer.getInstance();
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
