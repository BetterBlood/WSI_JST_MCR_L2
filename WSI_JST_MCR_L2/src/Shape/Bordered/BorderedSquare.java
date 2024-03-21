package Shape.Bordered;

import Shape.Square;
import java.awt.*;

public class BorderedSquare extends Square {
    public BorderedSquare(int maxWidth, int maxHeight){
        super(maxWidth, maxHeight);
    }
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.drawRect(0, 0, size - 1, size - 1);
    }
}
