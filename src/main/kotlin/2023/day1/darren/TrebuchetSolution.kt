package `2023`.day1.darren

class InvalidLineException() : Exception()

class TrebuchetSolution(val input: String) {
    val filtersArray = arrayOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    fun calculateCalibrationValues(): Int {
        val lines = input.split("\n")
        val values = lines.mapNotNull {
            val digits = it.filter { next -> next.isDigit() }
            if (digits.length >= 1) {
                "${digits.first()}${digits.last()}".toInt()
            } else {
                null
            }
        }
        return values.sum()
    }

    fun calculateSecondCalibrationValues(): Int {
        val lines = input.split("\n")

        val values = lines.mapNotNull {
            try {
                var part1: String? = getPart(it)
                var part2: String? = getPart(
                    it.substring(part1!!.length, it.length).reversed(),
                    providedFilters = filtersArray.map { entry -> entry.reversed() }.toTypedArray()
                )

                if (part1.length > 1) {
                    part1 = convertWrittenNumberToDigit(part1)
                }
                if (part2 != null && part2.length > 1) {
                    part2 = convertWrittenNumberToDigit(part2.reversed())
                } else if (part2 == null) {
                    part2 = part1
                }

                return@mapNotNull "${part1}${part2}".toInt()
            } catch (exception: InvalidLineException) {
                println(it)
                return@mapNotNull 0
            }
        }
        return values.sum()
    }


    private fun getPart(
        given: String,
        partial: String = "",
        index: Int = 0,
        previousGiven: String = "",
        providedFilters: Array<String> = filtersArray
    ): String? {

        var part: String? = null
        val lineArray = given.toCharArray()
        if (index > lineArray.size - 1) {
            return null
        }

        val currentChar = lineArray[index]
        if (currentChar.isDigit()) {
            return currentChar.toString()
        } else {
            val currentString = "$partial$currentChar"
            val exactMatch = providedFilters.filter { it == currentString }
            if (exactMatch.size == 1) {
                return exactMatch[0]
            }

            val partialMatches = providedFilters.filter { it.contains(currentString) }
            if (partialMatches.size > 0) {
                return getPart(
                    given = given.substring(1, given.length),
                    partial = currentString,
                    providedFilters = providedFilters,
                    previousGiven = given
                )
            } else if (partialMatches.size == 0) {
                if (previousGiven == given) {
                    return getPart(
                        given = given.substring(1, given.length),
                        partial = "",
                        0,
                        previousGiven = given,
                        providedFilters = providedFilters
                    )
                } else {
                    if (currentString.length > 2) {
                        return getPart(
                            given = previousGiven,
                            partial = "",
                            0,
                            previousGiven = given,
                            providedFilters = providedFilters
                        )
                    } else {
                        return getPart(
                            given = given,
                            partial = "",
                            0,
                            previousGiven = given,
                            providedFilters = providedFilters
                        )
                    }
                }
            }
        }
        return part
    }

    private fun convertWrittenNumberToDigit(given: String): String {
        return when (given) {
            "one" -> {
                "1"
            }

            "two" -> {
                "2"
            }

            "three" -> {
                "3"
            }

            "four" -> {
                "4"
            }

            "five" -> {
                "5"
            }

            "six" -> {
                "6"
            }

            "seven" -> {
                "7"
            }

            "eight" -> {
                "8"
            }

            "nine" -> {
                "9"
            }

            else -> {
                ""
            }
        }
    }
}

