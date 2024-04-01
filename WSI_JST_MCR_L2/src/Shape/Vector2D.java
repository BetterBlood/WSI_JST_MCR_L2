package Shape;

import static java.lang.Math.sqrt;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public class Vector2D {

    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void normalize()
    {
        double length = sqrt(x * x + y * y);
        x /= length;
        y /= length;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void swapOnX()
    {
        x *= -1;
    }

    public void swapOnY()
    {
        y *= -1;
    }
}
