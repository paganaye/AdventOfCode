val day6PascalSampleDataPart1 = """Time:      7  15   30
Distance:  9  40  200
"""
val day6PascalSampleDataPart2 = """Time:        55     82     64     90
Distance:   246   1441   1012   1111"""

val day6PascalSampleDataPart3 = """Time:        55826490
Distance:   246144110121111"""


data class TimeAndDistance(val time: Long, val distance: Long)

fun day6_Pascal() {
    val spaceOrMore = Regex(" +")

    fun parseTimeAndDistance(input: String): List<TimeAndDistance> {
        val lines = input.lines()
        val times = lines[0].split(spaceOrMore).drop(1).map { it.toLong() }
        val distances = lines[1].split(spaceOrMore).drop(1).map { it.toLong() }

        return times.mapIndexed { index, time -> TimeAndDistance(time, distances[index]) }
    }

    fun calculatePoints1(data: List<TimeAndDistance>): Long {
        var result = 1L

        data.forEach {
            val T = it.time
            var D = it.distance

            val a = -1.0
            val b = T.toDouble()
            val c = (-D).toDouble()
            var sqrtDelta = Math.sqrt(b * b - 4 * a * c)
            var x1 = (-b + sqrtDelta) / 2 * a
            var x2 = (-b - sqrtDelta) / 2 * a
            val i1 = kotlin.math.floor(x1)
            val i2 = kotlin.math.floor(x2)

            var count = i2 - i1
            if (i1 == x1) count -= 1
            result *= count.toLong()
        }

        return result
    }


//    fun calculatePoints2(data: List<TimeAndDistance>): Long {
//        return 0
//    }

    fun day6Part1(input: String): Long {
        val data = parseTimeAndDistance(input)
        val result = calculatePoints1(data)
        return result
    }

//    fun day6Part2(input: String): Long {
//        val data = parseTimeAndDistance(input)
//        val result = calculatePoints2(data)
//        return 0
//    }
    println("  * Part 1")
    println("    data: ${day6Part1(day6PascalSampleDataPart1)}")
    println("  * Part 2")
    println("    data: ${day6Part1(day6PascalSampleDataPart2)}")
    println("  * Part 3")
    println("    data: ${day6Part1(day6PascalSampleDataPart3)}")

}