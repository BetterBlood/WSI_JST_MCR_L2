package Shape.Renderer;

import java.awt.*;
import Shape.Bouncable;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the BorderedRenderer class.
 * @Info        : Represents a renderer for drawing bordered shapes.
 * -----------------------------------------------------------------------------------
 **/

public class BorderedRenderer implements Renderer{

    // region Intern Static Class (for Singleton)
    /**
     * @brief Represents an inner static class for implementing the Singleton pattern.
     */
    private static class Instance
    {
        /** The singleton instance of the BorderedRenderer class. */
        static final BorderedRenderer instance = new BorderedRenderer();
    }
    // endregion

    // region Public methode
    /**
     * @brief Gets the singleton instance of the BorderedRenderer class.
     * @return The singleton instance.
     */
    public static BorderedRenderer getInstance() {
        return BorderedRenderer.Instance.instance;
    }

    /**
     * @brief Displays the given shape with a border using the provided graphics context.
     * @param g The graphics context.
     * @param b The shape to display.
     */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }
    // endregion
}
