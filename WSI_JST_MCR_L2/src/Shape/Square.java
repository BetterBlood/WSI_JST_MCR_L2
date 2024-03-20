package Shape;

import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public class Square extends Shape {
    public Square(int maxSizes) {
        super(maxSizes);
    }

    @Override
    public void paintComponent(Graphics g){
        //super.paintComponent(g);
        //super.setBackground(Color.BLUE);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLUE);
        g2d.fillRect(0, 0, size, size);
    }
}
