package Shape.Bordered;

import Shape.Circle;
import java.awt.*;

public class BorderedCircle extends Circle {
    public BorderedCircle(int maxWidth, int maxHeight) {
        super(maxWidth, maxHeight);
    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.GREEN);
        g2.drawOval(0, 0, size - 1, size - 1);
    }
}
