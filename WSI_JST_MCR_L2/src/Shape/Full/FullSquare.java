package Shape.Full;

import Shape.Square;
import java.awt.*;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public class FullSquare extends Square {
    public FullSquare(int maxWidth, int maxHeight) {
        super(maxWidth, maxHeight);
    }

    @Override
    public void paintComponent(Graphics g){
        //super.paintComponent(g);
        //super.setBackground(Color.BLUE);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.ORANGE);
        g2.fillRect(0, 0, size, size);
    }
}
