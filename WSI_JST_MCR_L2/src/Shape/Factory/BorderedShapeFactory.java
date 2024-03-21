package Shape.Factory;

import Shape.Bordered.BorderedCircle;
import Shape.Bordered.BorderedSquare;

public class BorderedShapeFactory extends ShapeFactory{
    @Override
    public BorderedCircle createCircle() {
        return null;
    }

    @Override
    public BorderedSquare createSquare() {
        return null;
    }
}
