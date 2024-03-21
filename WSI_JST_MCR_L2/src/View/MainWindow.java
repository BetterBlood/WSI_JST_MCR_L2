package View;
import Shape.Bordered.BorderedCircle;
import Shape.Bordered.BorderedSquare;
import Shape.Shape;
import Shape.Full.FullCircle;
import Shape.Full.FullSquare;

import javax.swing.*;
import java.awt.*;


/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : TODO
 * @Info        : /
 * -----------------------------------------------------------------------------------
 **/

public class MainWindow implements Displayer {
    // region Field
    protected Image image;
    private Shape[] shapes;
    private final Dimension dimension;
    private final JFrame frame;
    // endregion

    // region Intern Static Class (for Singleton)
    private static class Instance
    {
        static final MainWindow instance = new MainWindow();
    }
    // endregion

    // region Ctor
    private MainWindow(){
        System.out.println("-- Singleton()");
        int size = 500;
        int nbrShape = 25; // 25
        dimension = new Dimension(size, size);

        shapes = new Shape[nbrShape * 4];
        frame = new JFrame();

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        JPanel panel = new JPanel();

        Dimension screenSize = toolkit.getScreenSize();
        frame.setLocation(new Point((int) screenSize.getWidth() / 4, (int) screenSize.getHeight() / 4));

        panel.setBackground(Color.GRAY);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        // TODO : pk 15 et 35 fonctionnent ??? idk mais ça marche
        frame.setSize(dimension.width + 15, dimension.height + 35);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        //frame.setResizable(false);

        for (int i = 0; i < shapes.length; ++i)
        {
            shapes[i] = new FullCircle(size);
            panel.add(shapes[i]);
            ++i;
            shapes[i] = new FullSquare(size);
            panel.add(shapes[i]);
            ++i;
            shapes[i] = new BorderedCircle(size);
            panel.add(shapes[i]);
            ++i;
            shapes[i] = new BorderedSquare(size);
            panel.add(shapes[i]);
        }

        image = frame.createImage(dimension.width, dimension.height);
        new Timer(25, e -> update()).start();
    }
    // endregion

    // region Public Methods
    public static MainWindow getInstance() {
        return Instance.instance;
    }

    @Override
    public int getWidth() {
        return dimension.width;
    }

    @Override
    public int getHeight() {
        return dimension.height;
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D)image.getGraphics();
    }

    @Override
    public void repaint() {
        for (Shape shape : shapes) {
            //shape.paintComponent(getGraphics());
        }
        //frame.repaint();
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }
    // endregion


    // region Private Methods
    private void update()
    {
        moveShapes();
        //repaint();
    }

    private void moveShapes()
    {
        for (Shape shape : shapes) {
            shape.moveShape(frame.getWidth(), frame.getHeight());
        }
    }
    // endregion
}