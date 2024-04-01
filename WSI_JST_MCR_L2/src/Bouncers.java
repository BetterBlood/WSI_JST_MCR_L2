import Shape.Factory.BorderedShapeFactory;
import Shape.Factory.FullShapeFactory;
import Shape.CustomShape;
import Shape.Factory.ShapeFactory;
import View.Displayer;
import View.MainWindow;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

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

public class Bouncers {

    // region Field
    private final LinkedList<CustomShape> bouncers;
    private final static int NBR_BY_CLICK = 10;
    private final static int REFRESH_DELAY = 10;
    // endregion

    // region Ctor
    public static void main(String[] args) {
        new Bouncers().run();
    }
    // endregion

    // region Public methode

    public Bouncers() {
        bouncers = new LinkedList<CustomShape>();
    }
    public void run() {
        MainWindow window = MainWindow.getInstance();
        window.setTitle("Bouncer");

        window.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_B ->
                        instantiate(BorderedShapeFactory.getInstance(), NBR_BY_CLICK);
                    case KeyEvent.VK_F ->
                        instantiate(FullShapeFactory.getInstance(), NBR_BY_CLICK);

                    case KeyEvent.VK_E -> bouncers.clear();
                    case KeyEvent.VK_Q -> System.exit(0);
                }
            }
        });

        new Timer(REFRESH_DELAY, e -> update(window)).start();
    }
    // endregion

    // region Private methode
    private void update(Displayer window)
    {
        moveShapes(window);
    }

    private void moveShapes(Displayer window) {
        window.repaint();
        for (CustomShape customShape : bouncers) {
            customShape.move();
            customShape.draw();
        }
    }

    private void instantiate(ShapeFactory factory, int nbr)
    {
        for (int i = 0; i < nbr; ++i)
        {
            bouncers.add(factory.createCircle());
            bouncers.add(factory.createSquare());
        }
    }
    // endregion
}