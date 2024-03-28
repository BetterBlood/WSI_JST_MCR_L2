package Shape.Factory;

import Shape.Bordered.BorderedCircle;
import Shape.Bordered.BorderedSquare;

public class BorderedShapeFactory extends ShapeFactory{
    @Override
    public BorderedCircle createCircle() {
        return new BorderedCircle();
    }

    @Override
    public BorderedSquare createSquare() {
        return new BorderedSquare();
    }
}
