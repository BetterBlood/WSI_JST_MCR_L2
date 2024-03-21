import Shape.Bordered.BorderedCircle;
import Shape.Bordered.BorderedSquare;
import Shape.Full.FullCircle;
import Shape.Full.FullSquare;
import Shape.Shape;
import View.Displayer;
import View.MainWindow;

import javax.swing.*;

/**
 * -----------------------------------------------------------------------------------
 * @Labo         : Labo 02 : Singleton
 * @Authors      : Slimani Walid & Steiner Jeremiah
 * @Description  : TODO
 *
 * @Remarque     : /
 * @Modification : /
 * -----------------------------------------------------------------------------------
 **/

public class Main {
    static Shape[] shapes; // devra être géré ailleurs je pense
    public static void main(String[] args) {

        MainWindow window = MainWindow.getInstance();
        MainWindow window2 = MainWindow.getInstance(); // récupère le même objet que la ligne précédente
        window2.setTitle("Bouncer");

        // tmp :
        shapes = new Shape[1 * 4];
        for (int i = 0; i < shapes.length; ++i)
        {
            shapes[i] = new FullCircle(window.getWidth(), window.getHeight());
            ++i;
            shapes[i] = new FullSquare(window.getWidth(), window.getHeight());
            ++i;
            shapes[i] = new BorderedCircle(window.getWidth(), window.getHeight());
            ++i;
            shapes[i] = new BorderedSquare(window.getWidth(), window.getHeight());
        }
        new Timer(25, e -> update(window)).start();
    }

    private static void update(Displayer window)
    {
        moveShapes(window);
    }

    private static void moveShapes(Displayer window)
    {
        for (Shape shape : shapes) {
            shape.moveShape(window.getWidth(), window.getHeight());
            shape.paintComponent(window.getGraphics());
        }
        window.repaint();
    }

}