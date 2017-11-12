package sarutobi.bills.ui.template;

import sarutobi.bills.domain.BillTemplate;

import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *  Панель отображения списка шаблонов
 * Project: bills
 * Created by sarutobi at 12.11.17.
 */
public final class TemplateList extends JPanel {

    private final DefaultListModel<BillTemplate> model = new DefaultListModel<>();

    private final JList<BillTemplate> list;

    public TemplateList() {
        super(new BorderLayout(5, 5));
        list = new JList<>(model);
        JScrollPane pane = new JScrollPane(list);
        add(pane, BorderLayout.CENTER);

        JPanel buttons = new JPanel(new FlowLayout());
        JButton add = new JButton(new AbstractAction("Add") {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addElement(createEmptyTemplate());
            }
        });
        JButton remove = new JButton(new AbstractAction("remove") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(model.size() > 0)
                    model.remove(0);
            }
        });
        buttons.add(add);
        buttons.add(remove);
        add(buttons, BorderLayout.SOUTH);
    }

    private BillTemplate createEmptyTemplate() {
        BillTemplate template = new BillTemplate();
        String name = "New template";
        template.setTemplateName(name);
        return template;
    }

    public BillTemplate getSelectedItem() {
        return list.getSelectedValue();
    }

    void addListSelectionListener(ListSelectionListener listener) {
        list.getSelectionModel().addListSelectionListener(listener);
    }
}
