package sarutobi.bills.domain;

import java.math.BigDecimal;
import java.time.YearMonth;

/**
 * Project: bills
 * Created by sarutobi at 12.11.17.
 */
public final class BillRow {
    private String itemName;
    private double itemsCount;
    private BigDecimal itemPrice;
    private BigDecimal totalPrice;
    private YearMonth forPeriod;
}