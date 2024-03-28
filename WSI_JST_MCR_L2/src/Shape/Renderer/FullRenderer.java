package Shape.Renderer;

import java.awt.*;
import Shape.Bouncable;

public class FullRenderer implements Renderer {
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
}
