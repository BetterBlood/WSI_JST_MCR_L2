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
    protected double xPos;
    protected double yPos;
    protected MovementVector movement;
    protected double speed;

    public Shape(int maxWidth, int maxHeight) {
        int minSize = 10;
        int maxSize = 50;
        size = random.nextInt(minSize, maxSize);
        movement = new MovementVector(random.nextInt(-10, 10), random.nextInt(-10, 10));
        speed = random.nextInt(3, 7);
        setSize(size, size);
        xPos = maxWidth/2.;
        yPos = maxHeight/2.;
        setLocation(new Point((int) xPos, (int)yPos));
        setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void moveShape(int maxWidth, int maxHeight)
    {
        // upper left corner
        int newX = (int) (xPos + movement.getX() * speed);
        int newY = (int) (yPos + movement.getY() * speed);

        if (newX + size > maxWidth || newX < 0)
        {
            //if (newX + size >= maxSize)
                //System.out.println((location.x + size) + " " + (newX + size) + " " + movement.getX());
            movement.swapOnX();
            newX = (int) (xPos + movement.getX() * speed);
        }

        if (newY + size > maxHeight || newY < 0)
        {
            //if (newY + size >= maxSize)
                //System.out.println((location.y + size) + " " + (newY + size) + " " + movement.getY());

            movement.swapOnY();
            newY = (int) (yPos + movement.getY() * speed);
        }

        xPos = newX;
        yPos = newY;

        setLocation(new Point((int) xPos, (int) yPos));
    }

}
