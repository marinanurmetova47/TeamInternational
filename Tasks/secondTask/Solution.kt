class Solution {
    fun convertTemperature(celsius: Double): DoubleArray {
        val array = doubleArrayOf(celsius + 273.15, celsius * 1.80 + 32.00)
        return array
    }
}
