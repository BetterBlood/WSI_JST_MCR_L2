package Shape.Renderer;

import java.awt.*;
import Shape.Bouncable;

public class FullRenderer implements Renderer {
    private static class Instance
    {
        static final FullRenderer instance = new FullRenderer();
    }

    public static FullRenderer getInstance() {
        return FullRenderer.Instance.instance;
    }

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
}
