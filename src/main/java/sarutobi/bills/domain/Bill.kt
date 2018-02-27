package sarutobi.bills.domain

import java.math.BigDecimal
import java.time.LocalDate
import java.time.YearMonth

/**
 * Выставленный счет.
 * Created by sarutobi.
 */
internal data class Bill(
        val id: Int? = null,
        val name: String = "",
        val billPeriod: YearMonth = YearMonth.of(1970, 1),
        val billDate: LocalDate? = null,
        val paidDate: LocalDate? = null,
        val fine: BigDecimal = BigDecimal.ZERO
) {
    fun isNotStored(): Boolean = id == null
}
