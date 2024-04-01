package Shape;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public abstract class Circle extends CustomShape {
    public Circle() {
        super();
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(position.getX(), position.getY(), size, size);
    }

}
