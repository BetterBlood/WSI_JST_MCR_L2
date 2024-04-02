package View;

import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the Displayer interface.
 * @Info        : Represents an interface for displaying graphics.
 * -----------------------------------------------------------------------------------
 **/

public interface Displayer
{
    // region Public methode
    /**
     * @brief Gets the width of the display area.
     * @return The width of the display area.
     */
    int getWidth();
    /**
     * @brief Gets the height of the display area.
     * @return The height of the display area.
     */
    int getHeight();
    /**
     * @brief Gets the graphics context for drawing on the display area.
     * @return The graphics context.
     */
    Graphics2D getGraphics();
    /**
     * @brief Repaints the display area.
     */
    void repaint();
    /**
     * @brief Sets the title of the display area.
     * @param title The title to set.
     */
    void setTitle(String title);
    /**
     * @brief Adds a key listener to the display area.
     * @param ka The key adapter to add.
     */
    void addKeyListener(KeyAdapter ka);
    // endregion
}
