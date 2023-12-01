import `2023`.day1.darren.DataSource
import `2023`.day1.darren.TrebuchetSolution

fun main(args: Array<String>) {

    val inputString = DataSource.getAsString()

    val trebuchetSolution = TrebuchetSolution(inputString)

    val starOneSolution = trebuchetSolution.calculateCalibrationValues()
    println(starOneSolution)

    val starTwoSolution = trebuchetSolution.calculateSecondCalibrationValues()
    println(starTwoSolution)
}