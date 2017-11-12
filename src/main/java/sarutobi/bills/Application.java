package sarutobi.bills;

import sarutobi.bills.ui.MainWindow;

import javax.swing.*;

/**
 * Project: bills
 * Created by sarutobi at 12.11.17.
 */
public class Application {
    public static void main(String... args) {
        new Application();
    }

    private Application() {
        SwingUtilities.invokeLater(MainWindow::new);
    }
}
