package Shape.Factory;

import Shape.Circle;
import Shape.Square;

public abstract class ShapeFactory {
    public abstract Circle createCircle();
    public abstract Square createSquare();
}
