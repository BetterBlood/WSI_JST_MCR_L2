package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;


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
    private final Container panel;
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

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension screenSize = toolkit.getScreenSize();
        frame.setLocation(new Point((int) screenSize.getWidth() / 4, (int) screenSize.getHeight() / 4));
        frame.setSize(dimension.width, dimension.height);
        frame.setPreferredSize(frame.getSize());

        panel = frame.getContentPane();
        panel.setBackground(Color.LIGHT_GRAY);
        image = panel.createImage(dimension.width, dimension.height);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                image = panel.createImage(getWidth(),
                        (getHeight() == 0 ? 1 : getHeight()) // aaaaaaaaa exception on height = 0
                );
            }
        });
        frame.setVisible(true);
    }
    // endregion

    // region Public Methods
    public static MainWindow getInstance() {
        return Instance.instance;
    }

    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) image.getGraphics();
    }

    @Override
    public void repaint() {
        //frame.getGraphics().drawImage(image, 0, 0, null);
        //panel.getGraphics().clearRect(0, 0, getWidth(), getHeight());
        //panel.getGraphics().setColor(Color.LIGHT_GRAY);
        //panel.getGraphics().fillRect(0, 0, getWidth(), getHeight());
        //getGraphics().drawImage(image, 0, 0, null);
        //panel.paintComponents(getGraphics());
        //panel.repaint();

        panel.getGraphics().drawImage(image, 0,0,null);
        getGraphics().clearRect(0, 0, getWidth(), getHeight());
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {

    }
    // endregion


    // region Private Methods
    // endregion
}