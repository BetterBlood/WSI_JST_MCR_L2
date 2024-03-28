package Shape;

import Shape.Renderer.Renderer;
import View.Displayer;
import View.MainWindow;


import java.awt.*;
import java.util.Random;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/
public abstract class CustomShape implements Bouncable {
    protected Displayer displayer;

    protected final static Random random = new Random();
    protected final int size;
    protected Vector2D movement;
    protected double speed;
    protected Vector2D position;

    protected Renderer renderer;


    public CustomShape() {
        displayer = MainWindow.getInstance();
        int minSize = 10;
        int maxSize = 50;
        size = random.nextInt(minSize, maxSize);
        movement = new Vector2D(random.nextInt(-10, 10), random.nextInt(-10, 10));
        movement.normalize();
        speed = random.nextInt(3, 7);
        position = new Vector2D(displayer.getWidth()/2., displayer.getHeight()/2.);
    }

    @Override
    public void draw() {
        // TODO qqch comme :
        renderer.display(displayer.getGraphics(), this);
        // mais renderer pas encore tester
    }

    @Override
    public void move() {
        int maxX = displayer.getWidth() - size;
        int maxY = displayer.getHeight() - size;

        Vector2D newPosition = new Vector2D(position.getX() + movement.getX() * speed,
                                            position.getY() + movement.getY() * speed);

        if (newPosition.getX() > maxX || newPosition.getX() < 0)
        {
            movement.swapOnX();
            newPosition = new Vector2D(position.getX() + movement.getX() * speed,
                                        newPosition.getY());
        }

        if (newPosition.getY() > maxY || newPosition.getY() < 0)
        {
            movement.swapOnY();
            newPosition = new Vector2D (newPosition.getX(), position.getY() + movement.getY() * speed);
        }

        position = newPosition;
    }
}
