package Shape;

import Shape.Renderer.Renderer;
import View.Displayer;
import View.MainWindow;

import java.util.Random;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the CustomShape abstract class.
 * @Info        : Represents an abstract class for custom shapes.
 * -----------------------------------------------------------------------------------
 **/

public abstract class CustomShape implements Bouncable {
    // region Field
    /** The display area associated with the custom shape. */
    protected Displayer displayer;

    /** The random number generator. */
    private final static Random random = new Random();

    /** The size of the custom shape. */
    protected final int size;

    /** The movement vector of the custom shape. */
    private final Vector2D movement;

    /** The speed of the custom shape. */
    private final double speed;

    /** The position vector of the custom shape. */
    protected Vector2D position;

    /** The renderer used to draw the custom shape. */
    protected Renderer renderer;
    // endregion

    // region Ctor
    /**
     * @brief Constructs a new instance of the CustomShape class.
     */
    protected CustomShape() {
        displayer = MainWindow.getInstance();
        int minSize = 10;
        int maxSize = 50;
        size = random.nextInt(minSize, maxSize);
        movement = new Vector2D(random.nextInt(-10, 10), random.nextInt(-10, 10));
        movement.normalize();
        speed = random.nextInt(3, 10);
        position = new Vector2D(displayer.getWidth()/2., displayer.getHeight()/2.);
    }
    // endregion

    // region Public methode
    /**
     * @brief Draws the custom shape.
     */
    @Override
    public void draw() {
        renderer.display(displayer.getGraphics(), this);
    }

    /**
     * @brief Moves the custom shape by applying the current movement.
     */
    @Override
    public void move() {
        int maxX = displayer.getWidth() - size;
        int maxY = displayer.getHeight() - size;

        Vector2D newPosition = new Vector2D(position.getX() + movement.getX() * speed,
                                            position.getY() + movement.getY() * speed);

        if (newPosition.getX() >= maxX || newPosition.getX() <= 0)
        {
            movement.swapOnX();
            newPosition = new Vector2D(min(position.getX() + movement.getX() * speed, maxX),
                                        max(0, newPosition.getY()));
        }

        if (newPosition.getY() >= maxY || newPosition.getY() <= 0)
        {
            movement.swapOnY();
            newPosition = new Vector2D (newPosition.getX(), newPosition.getY() < 0 ? 0 :
                            min(position.getY() + movement.getY() * speed, maxY));
        }

        position = newPosition;
    }
    // endregion
}
