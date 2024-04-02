package Shape;

import static java.lang.Math.sqrt;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the Vector2D class.
 * @Info        : Represents a 2D vector.
 * -----------------------------------------------------------------------------------
 **/

public class Vector2D {
    // region Field
    /** The x-coordinate of the vector. */
    private double x;

    /** The y-coordinate of the vector. */
    private double y;
    // endregion

    // region Ctor
    /**
     * @brief Constructs a new instance of the Vector2D class with specified coordinates.
     * @param x The x-coordinate of the vector.
     * @param y The y-coordinate of the vector.
     */
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // endregion

    // region Public methode
    /**
     * @brief Normalizes the vector.
     */
    public void normalize()
    {
        double length = sqrt(x * x + y * y);
        x /= length;
        y /= length;
    }

    /**
     * @brief Gets the x-coordinate of the vector.
     * @return The x-coordinate of the vector.
     */
    public double getX() {
        return x;
    }

    /**
     * @brief Gets the y-coordinate of the vector.
     * @return The y-coordinate of the vector.
     */
    public double getY() {
        return y;
    }

    /**
     * @brief Swaps the x-coordinate of the vector.
     */
    public void swapOnX()
    {
        x *= -1;
    }

    /**
     * @brief Swaps the y-coordinate of the vector.
     */
    public void swapOnY()
    {
        y *= -1;
    }
    // endregion
}
