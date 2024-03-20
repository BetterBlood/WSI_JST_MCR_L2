package Shape;

import static java.lang.Math.sqrt;

public class MovementVector {

    private double xMove;
    private double yMove;

    public MovementVector(double xMove, double yMove) {
        this.xMove = xMove;
        this.yMove = yMove;
        normalize();
    }

    private void normalize()
    {
        double length = sqrt(xMove * xMove + yMove * yMove);
        xMove /= length;
        yMove /= length;
    }

    public double getX() {
        return xMove;
    }

    public double getY() {
        return yMove;
    }

    public void swapOnX()
    {
        xMove *= -1;
    }

    public void swapOnY()
    {
        yMove *= -1;
    }
}
