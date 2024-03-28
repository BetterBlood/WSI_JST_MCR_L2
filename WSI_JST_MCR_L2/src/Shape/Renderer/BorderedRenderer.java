package Shape.Renderer;

import java.awt.*;
import Shape.Bouncable;
import View.MainWindow;

public class BorderedRenderer implements Renderer{

    private static class Instance
    {
        static final BorderedRenderer instance = new BorderedRenderer();
    }

    public static BorderedRenderer getInstance() {
        return BorderedRenderer.Instance.instance;
    }

    private BorderedRenderer(){};

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }
}
