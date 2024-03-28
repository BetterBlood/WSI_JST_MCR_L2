package Shape.Factory;

import Shape.Circle;
import Shape.Full.FullCircle;
import Shape.Full.FullSquare;

public class FullShapeFactory extends ShapeFactory{
    @Override
    public FullCircle createCircle() {
        return new FullCircle();
    }

    @Override
    public FullSquare createSquare() {
        return new FullSquare();
    }
}
