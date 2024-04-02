package Shape.Renderer;

import java.awt.*;
import Shape.Bouncable;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the FilledRenderer class.
 * @Info        : Represents a renderer for drawing filled shapes.
 * -----------------------------------------------------------------------------------
 **/

public class FilledRenderer implements Renderer {
    // region Intern Static Class (for Singleton)
    /**
     * @brief Represents an inner static class for implementing the Singleton pattern.
     */
    private static class Instance
    {
        /** The singleton instance of the FilledRenderer class. */
        static final FilledRenderer instance = new FilledRenderer();
    }
    // endregion

    // region Public methode
    /**
     * @brief Gets the singleton instance of the FilledRenderer class.
     * @return The singleton instance.
     */
    public static FilledRenderer getInstance() {
        return FilledRenderer.Instance.instance;
    }

    /**
     * @brief Displays the given shape filled with color using the provided graphics context.
     * @param g The graphics context.
     * @param b The shape to display.
     */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
    // endregion
}
