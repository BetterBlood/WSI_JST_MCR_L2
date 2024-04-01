package Shape.Factory;

import Shape.Circle;
import Shape.Full.FullCircle;
import Shape.Full.FullSquare;

public class FullShapeFactory extends ShapeFactory{

    // region Intern Static Class (for Singleton)
    private static class Instance
    {
        static final FullShapeFactory instance = new FullShapeFactory();
    }
    // endregion

    @Override
    public FullCircle createCircle() {
        return new FullCircle();
    }

    @Override
    public FullSquare createSquare() {
        return new FullSquare();
    }

    public static FullShapeFactory getInstance() {
        return FullShapeFactory.Instance.instance;
    }
}
