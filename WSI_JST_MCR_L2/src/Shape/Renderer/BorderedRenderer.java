package Shape.Renderer;

import java.awt.*;
import Shape.Bouncable;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public class BorderedRenderer implements Renderer{

    // region Intern Static Class (for Singleton)
    private static class Instance
    {
        static final BorderedRenderer instance = new BorderedRenderer();
    }
    // endregion

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
