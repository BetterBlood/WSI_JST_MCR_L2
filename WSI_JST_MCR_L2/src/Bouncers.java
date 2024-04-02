import Shape.Bouncable;
import Shape.Factory.BorderedShapeFactory;
import Shape.Factory.FilledShapeFactory;
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
 * @Description  : This file contains the definition of the Bouncers class,
 *                 represents a program that simulates bouncing shapes.
 * @Remarque     : /
 * @Modification : /
 * -----------------------------------------------------------------------------------
 **/

public class Bouncers {

    // region Field
    /** List of bouncing shapes. */
    private final LinkedList<Bouncable> bouncers;

    /** Number of shapes to instantiate by each key press. */
    private final static int NBR_BY_CLICK = 10;

    /** Delay for refreshing the display, in milliseconds. */
    private final static int REFRESH_DELAY = 10;
    // endregion

    // region Ctor
    /**
     * @brief Constructs a new instance of the Bouncers class.
     */
    private Bouncers() {
        bouncers = new LinkedList<Bouncable>();
    }
    // endregion

    // region Public methode
    /**
     * @brief The main method of the program.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        new Bouncers().run();
    }

    /**
     * @brief Runs the Bouncers program.
     */
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
                        instantiate(FilledShapeFactory.getInstance(), NBR_BY_CLICK);

                    case KeyEvent.VK_E -> bouncers.clear();
                    case KeyEvent.VK_Q -> System.exit(0);
                }
            }
        });

        new Timer(REFRESH_DELAY, e -> update(window)).start();
    }
    // endregion

    // region Private methode
    /**
     * @brief Updates the display.
     * @param window The display window.
     */
    private void update(Displayer window)
    {
        moveShapes(window);
    }

    /**
     * @brief Moves the shapes and updates the display.
     * @param window The display window.
     */
    private void moveShapes(Displayer window) {
        window.repaint();
        for (Bouncable customShape : bouncers) {
            customShape.move();
            customShape.draw();
        }
    }

    /**
     * @brief Instantiates a specified number of shapes using the given factory.
     * @param factory The shape factory.
     * @param nbr The number of shapes to instantiate.
     */
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