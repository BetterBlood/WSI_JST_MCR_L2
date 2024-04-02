package Shape.Factory;

import Shape.Bordered.BorderedCircle;
import Shape.Bordered.BorderedSquare;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public class BorderedShapeFactory extends ShapeFactory{

    // region Intern Static Class (for Singleton)
    private static class Instance
    {
        static final BorderedShapeFactory instance = new BorderedShapeFactory();
    }
    // endregion

    // region Public methode
    @Override
    public BorderedCircle createCircle() {
        return new BorderedCircle();
    }

    @Override
    public BorderedSquare createSquare() {
        return new BorderedSquare();
    }

    public static BorderedShapeFactory getInstance() {
        return BorderedShapeFactory.Instance.instance;
    }
    // endregion

}
