package View;

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
    private final int nbrCircle;
    private final int nbrSquare;

    private final Dimension dimension;

    private final JFrame frame;

    // endregion

    // region Intern Static Class
    private static class Instance
    {
        static final MainWindow instance = new MainWindow();
    }
    // endregion

    // region Ctor
    private MainWindow(){
        System.out.println("-- Singleton()");

        nbrCircle = 10;
        nbrSquare = 10;
        dimension = new Dimension(500, 500);
        frame = new JFrame();

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        JPanel panel = new JPanel();

        Dimension screenSize = toolkit.getScreenSize();
        frame.setLocation(new Point((int) screenSize.getWidth() / 3, (int) screenSize.getHeight() / 3));

        panel.setSize(dimension);
        frame.setSize(dimension);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        frame.setResizable(false);

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
        return null; // TODO
    }

    @Override
    public void repaint() {
        // TODO
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }
    // endregion


    // region Private Methods

    // endregion
}