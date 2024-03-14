import View.MainWindow;

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
    public static void main(String[] args) {
        MainWindow window = MainWindow.getInstance();
        MainWindow window2 = MainWindow.getInstance(); // récupère le même objet que la ligne précédente
        window2.setTitle("Bouncer");
    }

}