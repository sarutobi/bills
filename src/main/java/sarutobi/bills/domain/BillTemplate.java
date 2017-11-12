package sarutobi.bills.domain;

import java.util.List;

/**
 *  Описание одного шаблона для счета ЖКУ
 * Project: bills
 * Created by sarutobi at 12.11.17.
 */
public class BillTemplate {
    private int id;
    private String templateName;
    private String billName;
    private List<String> rowName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public List<String> getRowName() {
        return rowName;
    }

    public void setRowName(List<String> rowName) {
        this.rowName = rowName;
    }
}
