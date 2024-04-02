package Shape.Factory;

import Shape.Full.FullCircle;
import Shape.Full.FullSquare;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public class FullShapeFactory extends ShapeFactory{

    // region Intern Static Class (for Singleton)
    private static class Instance
    {
        static final FullShapeFactory instance = new FullShapeFactory();
    }
    // endregion

    // region Public methode
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
    // endregion
}
