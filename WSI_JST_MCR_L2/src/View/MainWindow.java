package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;

/**
 * -----------------------------------------------------------------------------------
 * @Authors     : Slimani Walid & Steiner Jeremiah
 * @Description : This file contains the definition of the MainWindow class.
 * @Info        : Represents the main window of the application.
 * -----------------------------------------------------------------------------------
 **/

public class MainWindow implements Displayer {
    // region Field
    /** The image associated with the main window. */
    protected Image image;

    /** The JFrame representing the main window. */
    private final JFrame frame;

    /** The container panel of the main window. */
    private final Container panel;
    // endregion

    // region Intern Static Class (for Singleton)
    /**
     * @brief Represents an inner static class for implementing the Singleton pattern.
     */
    private static class Instance
    {
        /** The singleton instance of the MainWindow class. */
        static final MainWindow instance = new MainWindow();
    }
    // endregion

    // region Ctor
    /**
     * @brief Constructs a new instance of the MainWindow class.
     */
    private MainWindow(){
        System.out.println("-- Singleton()");
        int size = 500;
        Dimension dimension = new Dimension(size, size);

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
                        // Exception on height = 0 => set to 1 in this case
                        (getHeight() == 0 ? 1 : getHeight())
                );
            }
        });
        frame.setVisible(true);
    }
    // endregion

    // region Public Methods
    /**
     * @brief Gets the singleton instance of the MainWindow class.
     * @return The singleton instance.
     */
    public static MainWindow getInstance() {
        return Instance.instance;
    }

    /**
     * @brief Gets the width of the main window.
     * @return The width of the main window.
     */
    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    /**
     * @brief Gets the height of the main window.
     * @return The height of the main window.
     */
    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    /**
     * @brief Gets the graphics context for drawing on the main window.
     * @return The graphics context.
     */
    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) image.getGraphics();
    }

    /**
     * @brief Repaints the main window.
     */
    @Override
    public void repaint() {
        panel.getGraphics().drawImage(image, 0,0,null);
        getGraphics().clearRect(0, 0, getWidth(), getHeight());
    }

    /**
     * @brief Sets the title of the main window.
     * @param title The title to set.
     */
    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    /**
     * @brief Adds a key listener to the main window.
     * @param ka The key adapter to add.
     */
    @Override
    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }
    // endregion

}