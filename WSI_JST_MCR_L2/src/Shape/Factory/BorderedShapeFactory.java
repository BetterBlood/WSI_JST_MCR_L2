package Shape.Factory;

import Shape.Bordered.BorderedCircle;
import Shape.Bordered.BorderedSquare;

public class BorderedShapeFactory extends ShapeFactory{
    @Override
    public BorderedCircle createCircle(int maxWidth, int maxHeight) {
        return new BorderedCircle(maxWidth, maxHeight);
    }

    @Override
    public BorderedSquare createSquare(int maxWidth, int maxHeight) {
        return new BorderedSquare(maxWidth, maxHeight);
    }
}
