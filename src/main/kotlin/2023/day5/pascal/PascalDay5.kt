val day5PascalSampleDataPart1 = """seeds: 79 14 55 13

seed-to-soil map:
50 98 2
52 50 48

soil-to-fertilizer map:
0 15 37
37 52 2
39 0 15

fertilizer-to-water map:
49 53 8
0 11 42
42 0 7
57 7 4

water-to-light map:
88 18 7
18 25 70

light-to-temperature map:
45 77 23
81 45 19
68 64 13

temperature-to-humidity map:
0 69 1
1 0 69

humidity-to-location map:
60 56 37
56 93 4"""


val day5PascalMainData =
    """"""


fun day5_Pascal() {

    data class Row(val destStart: Int, val sourceStart: Int, val length: Int)
    data class Map(val from: String, val to: String) {
        var rows = mutableListOf<Row>()
    }

    data class Maps(val seeds: List<Int>, val maps: List<Map>)

    fun parseRow(line: String): Row {
        val parts = line.split(" ").map { it.toInt() }
        return Row(parts[0], parts[1], parts[2])
    }

    fun parseMaps(input: String): Maps {
        val lines = input.lines()
        var seeds: List<Int>? = null
        var currentMap: Map? = null
        val maps = mutableListOf<Map>()
        input.lines().forEachIndexed() { i, line ->
            if (i == 0) {
                val parts = line.split(": ")
                seeds = parts[1].split(" ").map { it.toInt() }
            } else if (line.contains(":")) {
                val name = line.split(" ")[0].split("-to-")
                currentMap = Map(name[0], name[1])
                maps.add(currentMap!!)
            } else if (line.length > 0) {
                currentMap!!.rows.add(parseRow(line))
            }
        }
        return Maps(seeds!!, maps)

    }


    fun calculatePoints(maps: Maps): Int {
        var result = 0

        return result
    }

    fun calculatePoints2(maps: Maps): Int {
        var result = 0

        return result
    }

    fun day5Part1(input: String): Int {
        val parsedMaps = parseMaps(input)
        val result = calculatePoints(parsedMaps)
        return result
    }

    fun day5Part2(input: String): Int {
        val parsedMaps = parseMaps(input)
        val result = calculatePoints2(parsedMaps)
        return result
    }
    println("  * Part 1")
    println("    sample data: ${day5Part1(day5PascalSampleDataPart1)}")
    println("    main data: ${day5Part1(day5PascalMainData)}")
    println("  * Part 2")
    println("    sample data: ${day5Part2(day5PascalSampleDataPart1)}")
    println("    main data: ${day5Part2(day5PascalMainData)}")

}