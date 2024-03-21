package Shape.Bordered;

import java.awt.*;

public class BorderedCircle extends BorderedShape{
    public BorderedCircle(int maxSizes) {
        super(maxSizes);
    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GREEN);
        g2d.drawOval(0, 0, size - 1, size - 1);
    }
}
