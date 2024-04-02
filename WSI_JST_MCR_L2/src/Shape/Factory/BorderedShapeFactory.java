package Shape.Factory;

import Shape.Bordered.BorderedCircle;
import Shape.Bordered.BorderedSquare;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the BorderedShapeFactory class.
 * @Info        : Represents a factory for creating bordered shapes.
 * -----------------------------------------------------------------------------------
 **/

public class BorderedShapeFactory extends ShapeFactory{

    // region Intern Static Class (for Singleton)
    /**
     * @brief Represents an inner static class for implementing the Singleton pattern.
     */
    private static class Instance
    {
        /** The singleton instance of the BorderedShapeFactory class. */
        static final BorderedShapeFactory instance = new BorderedShapeFactory();
    }
    // endregion

    // region Public methode
    /**
     * @brief Creates a new bordered circle.
     * @return The created bordered circle.
     */
    @Override
    public BorderedCircle createCircle() {
        return new BorderedCircle();
    }

    /**
     * @brief Creates a new bordered square.
     * @return The created bordered square.
     */
    @Override
    public BorderedSquare createSquare() {
        return new BorderedSquare();
    }

    /**
     * @brief Gets the singleton instance of the BorderedShapeFactory class.
     * @return The singleton instance.
     */
    public static BorderedShapeFactory getInstance() {
        return BorderedShapeFactory.Instance.instance;
    }
    // endregion

}
