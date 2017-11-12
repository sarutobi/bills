package sarutobi.bills.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

/**
 * Created by sarutobi.
 */
public class Bill {
    private String name;
    private YearMonth billPeriod;
    private LocalDate billDate;
    private LocalDate paidDate;
    private List<BillRow> rowNames;
    private BigDecimal fine;
}
