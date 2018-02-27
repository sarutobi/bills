package sarutobi.bills.domain

import java.math.BigDecimal
import java.time.YearMonth

/**
 * Строка данных по счету.
 * Project: bills
 * Created by sarutobi at 12.11.17.
 */
internal data class BillRow(
        val id: Int? = null,
        val billId: Int, //Ссылка на счет
        //var forPeriod: YearMonth? = null // Расчетный период
        val itemName: String = "",  // Наименование
        val itemPrice: BigDecimal = BigDecimal.ZERO, // Тариф
        val itemsCount: Double = 0.toDouble(), // Потребление
        val countPrice: BigDecimal = BigDecimal.ZERO, // Сумма за потребление
        var recalculation: BigDecimal = BigDecimal.ZERO, // Перерасчеты
        var totalPrice: BigDecimal? = null // Итого к оплате
)