import Shape.Factory.BorderedShapeFactory;
import Shape.Factory.FullShapeFactory;
import Shape.CustomShape;
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

/*
public class Bouncers {

    private LinkedList<Bouncable> bouncers;

    public Bouncers() {

    }
    public void run() {

    }
    public static void main(String ... args) {
        new Bouncers().run();
    }
}//*/

public class Main {
    static CustomShape[] customShapes; // devra être géré ailleurs je pense
    public static void main(String[] args) {

        MainWindow window = MainWindow.getInstance();
        MainWindow window2 = MainWindow.getInstance(); // récupère le même objet que la ligne précédente
        window2.setTitle("Bouncer");

        BorderedShapeFactory bFactory = new BorderedShapeFactory();
        FullShapeFactory fFactory = new FullShapeFactory();

        // tmp :
        customShapes = new CustomShape[5 * 4];
        for (int i = 0; i < customShapes.length; ++i)
        {
            customShapes[i] = fFactory.createCircle();
            ++i;
            customShapes[i] = fFactory.createSquare();
            ++i;
            customShapes[i] = bFactory.createCircle();
            ++i;
            customShapes[i] = bFactory.createSquare();
        }
        new Timer(10, e -> update(window)).start();
    }

    private static void update(Displayer window)
    {
        moveShapes(window);
    }

    private static void moveShapes(Displayer window)
    {
        //System.out.println("moveShapes called");
        window.repaint();
        for (CustomShape customShape : customShapes) {
            customShape.move(); // à tester
            customShape.draw(); // à tester
        }
        //window.repaint();
    }

}