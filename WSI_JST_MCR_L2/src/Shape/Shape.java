package Shape;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Vector;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/
public abstract class Shape extends JPanel {
    protected final static Random random = new Random();
    protected final int size;
    protected Point location;
    protected MovementVector movement;
    protected double speed;

    public Shape(int maxSizes) {
        int minSize = 10;
        int maxSize = 50;
        size = random.nextInt(minSize, maxSize);
        movement = new MovementVector(random.nextInt(-10, 10), random.nextInt(-10, 10));
        speed = 3;
        setSize(size, size);
        location = new Point(random.nextInt(maxSizes - maxSize), random.nextInt(maxSizes - maxSize));
        setLocation(location);
        setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void move(int maxSize)
    {
        // upper left corner
        int newX = (int) (location.x + movement.getX() * speed);
        int newY = (int) (location.y + movement.getY() * speed);

        if (newX + size >= maxSize || newX < 0)
        {
            if (newX + size >= maxSize)
                System.out.println((location.x + size) + " " + (newX + size) + " " + movement.getX());
            movement.swapOnX();
            newX = (int) (location.x + movement.getX() * speed);
        }

        if (newY + size >= maxSize || newY < 0)
        {
            if (newY + size >= maxSize)
                System.out.println((location.y + size) + " " + (newY + size) + " " + movement.getY());

            movement.swapOnY();
            newY = (int) (location.y + movement.getY() * speed);
        }

        location.x = newX;
        location.y = newY;

        setLocation(location);
    }

}
