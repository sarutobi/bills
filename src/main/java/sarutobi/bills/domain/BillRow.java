package sarutobi.bills.domain;

import java.math.BigDecimal;
import java.time.YearMonth;

/**
 *  Строка данных по счету.
 * Project: bills
 * Created by sarutobi at 12.11.17.
 */
public final class BillRow {
    private int id;
    private YearMonth forPeriod; // Расчетный период
    private String itemName;  // Наименование
    private BigDecimal itemPrice; // Тариф
    private double itemsCount; // Потребление
    private BigDecimal countPrice; // Сумма за потребление
    private BigDecimal recalculation; // Перерасчеты
    private BigDecimal totalPrice; // Итого к оплате

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public YearMonth getForPeriod() {
        return forPeriod;
    }

    public void setForPeriod(YearMonth forPeriod) {
        this.forPeriod = forPeriod;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(double itemsCount) {
        this.itemsCount = itemsCount;
    }

    public BigDecimal getCountPrice() {
        return countPrice;
    }

    public void setCountPrice(BigDecimal countPrice) {
        this.countPrice = countPrice;
    }

    public BigDecimal getRecalculation() {
        return recalculation;
    }

    public void setRecalculation(BigDecimal recalculation) {
        this.recalculation = recalculation;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}