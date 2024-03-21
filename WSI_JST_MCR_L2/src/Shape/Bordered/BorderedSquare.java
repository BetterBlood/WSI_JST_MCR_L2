package Shape.Bordered;

import java.awt.*;

public class BorderedSquare extends BorderedShape {
    public BorderedSquare(int maxSizes) {
        super(maxSizes);
    }
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.drawRect(0, 0, size - 1, size - 1);
    }
}
