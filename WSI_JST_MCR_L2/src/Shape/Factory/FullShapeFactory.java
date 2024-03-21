package Shape.Factory;

import Shape.Circle;
import Shape.Full.FullCircle;
import Shape.Full.FullSquare;

public class FullShapeFactory extends ShapeFactory{
    @Override
    public FullCircle createCircle(int maxWidth, int maxHeight) {
        return new FullCircle(maxWidth, maxHeight);
    }

    @Override
    public FullSquare createSquare(int maxWidth, int maxHeight) {
        return new FullSquare(maxWidth, maxHeight);
    }
}
