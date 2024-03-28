package Shape;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public abstract class Circle extends CustomShape {
    public Circle() {
        super();
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(position.getX(), position.getY(), size, size);
    }

}
