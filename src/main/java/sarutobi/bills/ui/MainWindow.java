package sarutobi.bills.ui;

import sarutobi.bills.ApplicationContext;
import sarutobi.bills.ui.template.TemplatePanel;

import javax.swing.*;
import java.awt.*;

/**
 * Project: bills
 * Created by sarutobi at 12.11.17.
 */
public final class MainWindow extends JFrame {
    private final ApplicationContext context;

    public MainWindow(ApplicationContext context) {
        super("Контроль счетов ЖКУ");
        this.context = context;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(new TemplatePanel(), BorderLayout.CENTER);
        pack();
    }
}
