package Shape.Full;

import Shape.Circle;
import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public class FullCircle extends Circle {
    public FullCircle(int maxWidth, int maxHeight) {
        super(maxWidth, maxHeight);
    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.fillOval(0, 0, size, size);
    }
}
