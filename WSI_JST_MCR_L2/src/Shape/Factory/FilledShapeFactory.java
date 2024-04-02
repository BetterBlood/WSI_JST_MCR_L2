package Shape.Factory;

import Shape.Filled.FilledCircle;
import Shape.Filled.FilledSquare;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the FilledShapeFactory class.
 * @Info        : Represents a factory for creating filled shapes.
 * -----------------------------------------------------------------------------------
 **/

public class FilledShapeFactory extends ShapeFactory{

    // region Intern Static Class (for Singleton)
    /**
     * @brief Represents an inner static class for implementing the Singleton pattern.
     */
    private static class Instance
    {
        /** The singleton instance of the FilledShapeFactory class. */
        static final FilledShapeFactory instance = new FilledShapeFactory();
    }
    // endregion

    // region Public methode
    /**
     * @brief Creates a new filled circle.
     * @return The created filled circle.
     */
    @Override
    public FilledCircle createCircle() {
        return new FilledCircle();
    }

    /**
     * @brief Creates a new filled square.
     * @return The created filled square.
     */
    @Override
    public FilledSquare createSquare() {
        return new FilledSquare();
    }

    /**
     * @brief Gets the singleton instance of the FilledShapeFactory class.
     * @return The singleton instance.
     */
    public static FilledShapeFactory getInstance() {
        return FilledShapeFactory.Instance.instance;
    }
    // endregion
}
