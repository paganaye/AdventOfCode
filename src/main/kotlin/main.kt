@file:Suppress("FunctionName", "unused")

import `2023`.day1.darren.DataSource
import `2023`.day1.darren.TrebuchetSolution


fun day1_Darren() {
    val inputString = DataSource.getAsString()

    val trebuchetSolution = TrebuchetSolution(inputString)

    val starOneSolution = trebuchetSolution.calculateCalibrationValues()
    println(starOneSolution)

    val starTwoSolution = trebuchetSolution.calculateSecondCalibrationValues()
    println(starTwoSolution)
}

fun main() {
//    println("** Day 1 - Darren")
//    day1_Darren()
//    println("** Day 1 - Pascal")
//    day1_Pascal()
//    println()
//    println("** Day 3 - Pascal")
//    day3_Pascal()

//    println("** Day 4 - Pascal")
//    day4_Pascal()

    day7_Pascal()
}