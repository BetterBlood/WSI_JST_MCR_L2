package Shape.Factory;

import Shape.Circle;
import Shape.Square;

public abstract class ShapeFactory {
    public abstract Circle createCircle(int maxWidth, int maxHeight);
    public abstract Square createSquare(int maxWidth, int maxHeight);
}
