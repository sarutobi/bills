package sarutobi.bills.domain

/**
 * Описание одного шаблона для счета ЖКУ
 * Project: bills
 * Created by sarutobi at 12.11.17.
 */
internal data class BillTemplate(
        val id: Int? = null,
        val templateName: String = "",
        val billName: String = "",
        val rows: List<String> = ArrayList<String>()
) {
    override fun toString(): String = templateName
}
