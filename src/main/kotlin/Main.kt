package ru.netology

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Сумма покупки в рублях
    val amount = readlnOrNull()?.toDoubleOrNull() ?: return

    // Статус покупателя: true - постоянный, false - обычный
    val isRegularCustomer = readlnOrNull()?.toBoolean() ?: return

    // Вычисление стандартной скидки
    val discount = when {
        amount in 0.0..1000.0 -> 0.0
        amount in 1001.0..10000.0 -> 100.0
        amount > 10000.0 -> amount * 0.05
        else -> 0.0
    }

    // Итоговая сумма после стандартной скидки
    var finalAmount = amount - discount

    // Применение дополнительной скидки для постоянных покупателей
    if (isRegularCustomer) {
        finalAmount *= 0.99
    }

    // Вывод итоговой стоимости покупки
    println("Итоговая стоимость покупки: %.2f рублей".format(finalAmount))
}
