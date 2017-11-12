package sarutobi.bills.ui.template;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import sarutobi.bills.domain.BillTemplate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Детальное отображение шаблона
 * Project: bills
 * Created by sarutobi at 12.11.17.
 */
public final class TemplateDetail extends JPanel {

    private BillTemplate selectedTemplate;

    private final JTextField templateName = new JTextField();
    private final JTextField billName = new JTextField();

    //    private final JList<String> templateRows;
    public TemplateDetail() {
        super(new BorderLayout());
        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(new JLabel("Шаблон"));
        panel.add(templateName);
        panel.add(new JLabel("Наименование счета"));
        panel.add(billName);
        add(panel, BorderLayout.CENTER);

        JPanel buttons = new JPanel(new FlowLayout());
        JButton ok = new JButton(new AbstractAction("Сохранить") {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirm();
            }
        });
        buttons.add(ok);
        add(buttons, BorderLayout.SOUTH);
    }

    public void setSelectedTemplate(@Nullable BillTemplate selected) {
        selectedTemplate = selected;
        if (selected != null) {
            fillFields(selected);
        } else {
            clearFields();
        }
    }

    private void fillFields(@NotNull BillTemplate selected) {
        this.templateName.setText(selected.getTemplateName());
        this.billName.setText(selected.getBillName());
    }

    private void clearFields() {
        this.templateName.setText("");
        this.billName.setText("");
    }

    private void confirm() {
        if (selectedTemplate != null) {
            selectedTemplate.setTemplateName(templateName.getText().trim());
            selectedTemplate.setBillName(billName.getText().trim());
        }
    }
}
