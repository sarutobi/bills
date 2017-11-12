package sarutobi.bills.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;

/**
 *  Выставленный счет.
 * Created by sarutobi.
 */
public final class Bill {
    private int id;
    private String name; // Наименование счета
    private YearMonth billPeriod; // Период выставления счета
    private LocalDate billDate; // Дата выписки счета
    private LocalDate paidDate; // Дата оплаты счета
    private BigDecimal fine; // Пени по счету на дату выписки.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public YearMonth getBillPeriod() {
        return billPeriod;
    }

    public void setBillPeriod(YearMonth billPeriod) {
        this.billPeriod = billPeriod;
    }

    public LocalDate getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }

    public LocalDate getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDate paidDate) {
        this.paidDate = paidDate;
    }

    public BigDecimal getFine() {
        return fine;
    }

    public void setFine(BigDecimal fine) {
        this.fine = fine;
    }
}
