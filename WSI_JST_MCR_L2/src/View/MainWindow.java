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

public class MainWindow extends JFrame{
    // region Field
    private final Point windowLocation;
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
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        JPanel panel = new JPanel();
        setTitle("to define");

        Dimension screenSize = toolkit.getScreenSize();
        windowLocation = new Point((int)screenSize.getWidth()/3, (int)screenSize.getHeight()/3);
        setLocation(windowLocation);

        panel.setSize(new Dimension(500, 500));
        setSize(new Dimension(500, 500));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(panel);
        setResizable(false);
    }
    // endregion

    public static MainWindow getInstance() {
        return Instance.instance;
    }


    //region Private Methods

    // endregion
}