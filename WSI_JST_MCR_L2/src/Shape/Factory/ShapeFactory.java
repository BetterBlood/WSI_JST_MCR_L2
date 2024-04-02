package Shape.Factory;

import Shape.Circle;
import Shape.Square;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public abstract class ShapeFactory {
    // region Public methode
    public abstract Circle createCircle();
    public abstract Square createSquare();
    // endregion
}
