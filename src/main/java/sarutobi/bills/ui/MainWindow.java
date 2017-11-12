package sarutobi.bills.ui;

import sarutobi.bills.ui.template.TemplatePanel;

import javax.swing.*;
import java.awt.*;

/**
 * Project: bills
 * Created by sarutobi at 12.11.17.
 */
public class MainWindow extends JFrame {

    public MainWindow() {
        super("Контроль счетов ЖКУ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(new TemplatePanel(), BorderLayout.CENTER);
        pack();
    }
}
