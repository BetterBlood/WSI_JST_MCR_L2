package Shape.Renderer;

import java.awt.*;
import Shape.Bouncable;

public class BorderedRenderer implements Renderer{
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }
}
