import Shape.Bordered.BorderedCircle;
import Shape.Bordered.BorderedSquare;
import Shape.Factory.BorderedShapeFactory;
import Shape.Factory.FullShapeFactory;
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

        BorderedShapeFactory bFactory = new BorderedShapeFactory();
        FullShapeFactory fFactory = new FullShapeFactory();

        // tmp :
        shapes = new Shape[1 * 4];
        for (int i = 0; i < shapes.length; ++i)
        {
            shapes[i] = fFactory.createCircle(window.getWidth(), window.getHeight());
            ++i;
            shapes[i] = fFactory.createSquare(window.getWidth(), window.getHeight());
            ++i;
            shapes[i] = bFactory.createCircle(window.getWidth(), window.getHeight());
            ++i;
            shapes[i] = bFactory.createSquare(window.getWidth(), window.getHeight());
        }
        new Timer(25, e -> update(window)).start();
    }

    private static void update(Displayer window)
    {
        moveShapes(window);
    }

    private static void moveShapes(Displayer window)
    {
        //System.out.println("moveShapes called");
        //window.repaint();
        for (Shape shape : shapes) {
            shape.moveShape(window.getWidth(), window.getHeight()); // ok
            shape.paintComponent(window.getGraphics()); // pas ok
        }
        window.repaint();
    }

}