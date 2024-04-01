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

public class FullRenderer implements Renderer {
    // region Intern Static Class (for Singleton)
    private static class Instance
    {
        static final FullRenderer instance = new FullRenderer();
    }
    // endregion

    public static FullRenderer getInstance() {
        return FullRenderer.Instance.instance;
    }

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
}
