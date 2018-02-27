package sarutobi.bills.ui

import tornadofx.*

class BillForm : View("Счет") {
    override val root = borderpane {
        center {
            form {
                fieldset {
                    hbox(10) {
                        field("Наименование") {
                            textfield()
                        }

                        field("Отчетный период") {
                            datepicker()
                        }
                    }

                    hbox(10) {
                        field("Дата выписки") {
                            datepicker()
                        }

                        field("Дата оплаты") {
                            datepicker()
                        }
                    }
                }
            }
        }
    }
}
