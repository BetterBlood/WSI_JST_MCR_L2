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
    private final Dimension dimension;
    private final JFrame frame;
    private final JPanel panel;
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
        dimension = new Dimension(size, size);

        frame = new JFrame();

        panel = new JPanel();

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension screenSize = toolkit.getScreenSize();
        frame.setLocation(new Point((int) screenSize.getWidth() / 4, (int) screenSize.getHeight() / 4));

        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        image = panel.createImage(dimension.width, dimension.height);
        // TODO : pk 15 et 35 fonctionnent ??? idk mais ça marche
        frame.setSize(dimension.width + 15, dimension.height + 35);
        frame.setPreferredSize(frame.getSize());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.add(panel);
        frame.setContentPane(panel);

        frame.pack();
        frame.setVisible(true);
    }
    // endregion

    // region Public Methods
    public static MainWindow getInstance() {
        return Instance.instance;
    }

    @Override
    public int getWidth() {
        return frame.getWidth();
    }

    @Override
    public int getHeight() {
        return frame.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D)panel.getGraphics();
    }

    @Override
    public void repaint() {
        //frame.getGraphics().drawImage(image, 0, 0, null);
        panel.getGraphics().drawImage(image, 0, 0, null);
        panel.paintComponents(getGraphics());
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }
    // endregion


    // region Private Methods
    // endregion
}