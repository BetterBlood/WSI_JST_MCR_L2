package Shape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public abstract class Square extends CustomShape {
    // region Ctor
    public Square() {
        super();
    }
    // endregion

    // region Public methode
    @Override
    public final Shape getShape() {
        return new Rectangle2D.Double(position.getX(), position.getY(), size, size);
    }
    // endregion
}
