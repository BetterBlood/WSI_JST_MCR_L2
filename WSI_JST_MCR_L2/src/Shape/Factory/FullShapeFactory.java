package Shape.Factory;

import Shape.Full.FullCircle;
import Shape.Full.FullSquare;

public class FullShapeFactory extends ShapeFactory{
    @Override
    public FullCircle createCircle() {
        return null;
    }

    @Override
    public FullSquare createSquare() {
        return null;
    }
}
