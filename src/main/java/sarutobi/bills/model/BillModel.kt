package sarutobi.bills.model

import sarutobi.bills.domain.Bill
import tornadofx.*

internal class BillModel : ItemViewModel<Bill>() {
    private val name = bind { item?.name.toProperty() }

    override fun onCommit() {
        item = item.copy(name = name.value)
    }
}