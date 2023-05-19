fun main() {
    val commission = 0.0075
    val minimumCommissionSum = 35_00
    val amount = 10_035_50
    val totalCommissionSum = (amount*commission).toInt()
    val resultCommissionSum = if( totalCommissionSum < minimumCommissionSum) minimumCommissionSum else totalCommissionSum
    println("Комиссия за перевод " + resultCommissionSum/100 + "руб. " + resultCommissionSum%100 + " коп.")

}