fun main() {
    val commission = 0.0075
    val minimumCommissionSum = 35_00
    val amount = 10_000_00
    val totalCommissionSum = amount*commission
    val resultCommissionSum = if( totalCommissionSum < minimumCommissionSum) minimumCommissionSum else totalCommissionSum
    val resultCommissionSumRub = resultCommissionSum.toDouble()/100
    println(resultCommissionSumRub)

}