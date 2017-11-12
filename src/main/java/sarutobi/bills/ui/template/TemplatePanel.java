package sarutobi.bills.ui.template;

import sarutobi.bills.domain.BillTemplate;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.Optional;

/**
 *  Панель настройки шаблона для счета ЖКУ
 * Project: bills
 * Created by sarutobi at 12.11.17.
 */
public final class TemplatePanel extends JPanel  implements ListSelectionListener{

    private TemplateList templateList;
    private TemplateDetail templateDetail;

    public TemplatePanel() {
        super(new BorderLayout());
        templateList = new TemplateList();
        templateDetail = new TemplateDetail();
        add(templateList, BorderLayout.WEST);
        add(templateDetail, BorderLayout.CENTER);
        templateList.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel model = (ListSelectionModel) e.getSource();
        BillTemplate selected = model.isSelectionEmpty() ? null : templateList.getSelectedItem();
        templateDetail.setSelectedTemplate(selected);
    }
}
