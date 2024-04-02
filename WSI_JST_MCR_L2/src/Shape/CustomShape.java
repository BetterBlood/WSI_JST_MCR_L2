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
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public abstract class CustomShape implements Bouncable {
    // region Field
    protected Displayer displayer;

    private final static Random random = new Random();
    protected final int size;
    private final Vector2D movement;
    private final double speed;
    protected Vector2D position;

    protected Renderer renderer;
    // endregion

    // region Ctor
    public CustomShape() {
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
    @Override
    public void draw() {
        renderer.display(displayer.getGraphics(), this);
    }

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
