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
    """seeds: 2149186375 163827995 1217693442 67424215 365381741 74637275 1627905362 77016740 22956580 60539394 586585112 391263016 2740196667 355728559 2326609724 132259842 2479354214 184627854 3683286274 337630529

seed-to-soil map:
3229936931 3770233758 236381937
3646926122 3757559297 12674461
938394995 626913497 352323383
2516043511 0 51589736
3224558845 3632370674 5378086
3154383669 3733142176 3946275
2567633247 1181073360 126906268
0 1307979628 138466492
286338057 1446446120 652056938
3626455276 3737088451 20470846
1290718378 2229802472 3472788
2327189933 569558202 57355295
3026168476 4006615695 128215193
3158329944 3566141773 66228901
3915379752 3026168476 379587544
1627676565 2233275260 461264255
2515844642 385075135 198869
2088940820 385274004 184284198
3819986336 3637748760 95393416
2273225018 979236880 53964915
3466318868 4134830888 160136408
1294191166 51589736 333485399
138466492 1033201795 147871565
3659600583 3405756020 160385753
2384545228 2098503058 131299414

soil-to-fertilizer map:
2991238558 2151391892 144378737
1183223769 2295770629 113964757
1297188526 1089334530 386627390
1089334530 3060803751 93889239
1683815916 3154692990 1140274306
3135617295 2409735386 483920029
4282117858 2138542454 12849438
3619537324 1475961920 662580534
2824090222 2893655415 167148336

fertilizer-to-water map:
1781174267 3172095614 252304554
1777350394 205858418 3823873
3481300219 2900371834 228938690
629285174 3911240322 150964034
4139459951 4244437788 50529508
2729976567 269940901 128857098
910342261 3129310524 42785090
1576648209 1091396587 111088326
1296874963 3585901272 233869698
3710238909 168200356 37658062
1687736535 4154823929 89613859
953127351 4062204356 92619573
552009002 158449435 9750921
2719891798 1038135909 10084769
3223980609 529688260 257319610
2033478821 1532972418 624586061
2858833665 2597021594 303350240
4096284042 1048220678 43175909
626349664 526752750 2935510
794975913 3834497675 58843081
3765796537 1202484913 330487505
853818994 3424400168 56523267
3747896971 3893340756 17899566
1530744661 2157558479 19983260
1045746924 787007870 251128039
132529147 2177541739 419479855
780249208 3819770970 14726705
3163721999 209682291 60258610
2658064882 463387740 61826916
3162183905 525214656 1538094
4189989459 3480923435 104977837
1550727921 132529147 25920288
561759923 398797999 64589741

water-to-light map:
3089483450 929490911 132962403
2505150397 1675046001 88332095
3674189474 3881789775 95079143
487699292 2280047063 119590919
2691722732 2904437110 186305619
734683438 2471684433 263879127
424005934 1311132479 63693358
2066817488 1626942755 48103246
4220411699 3381137532 52192686
1272878735 2440662693 31021740
2659005903 2399637982 32716829
1141175611 3090742729 131703124
1324856035 480042365 41880678
4078508529 3341878136 23998484
3392898998 4013676820 206668183
1819185760 360597775 53921179
1584721442 1933117275 234464318
607290211 802097684 127393227
2114920734 1374825837 252116918
4272604385 3859426864 22362911
2036056683 2873676305 30760805
3056075412 768689646 33408038
1375280832 8544119 209440610
112465470 1062453314 248679165
1303900475 521923043 20955560
3341878136 3475705318 51020862
3972027287 3537397184 64106142
3811788516 3601503326 69230778
361144635 542878603 62861299
1366736713 0 8544119
3769268617 3816906965 42519899
1873106939 605739902 162949744
2878028351 2432354811 8307882
2886336233 1763378096 169739179
4130652814 3365876620 15260912
3599567181 4220345003 74622293
0 2167581593 112465470
4209740695 3526726180 10671004
2367037652 2735563560 138112745
3881019294 3976868918 8662101
4036133429 3433330218 42375100
4102507013 3985531019 28145801
3889681395 3670734104 82345892
2593482492 414518954 65523411
4145913726 3753079996 63826969
998562565 217984729 142613046

light-to-temperature map:
1941760763 1585007922 25353840
4031153040 1610361762 71241272
4225876754 972893749 69090542
1426899362 2063678063 17216958
852041331 3169727243 149223547
2700225684 2869762423 88404546
1641196592 702579563 136462841
4102394312 1461525480 123482442
1444116320 3910271612 16089747
458934721 4276740328 18226968
2302105532 3036223883 133503360
2537110151 3618113777 89051179
26320902 0 26087247
2788630230 2763464440 106297983
1303054891 656323277 45787557
3803268902 1233641342 227884138
1941402499 3971401567 358264
1001264878 1681603034 301790013
3611611851 1041984291 191657051
3414223295 458934721 197388556
477161689 839042404 133851345
2469953812 3707164956 67156339
2238153332 3971759831 63952200
2435608892 3583768857 34344920
1460206067 3926361359 45040208
1777659433 702110834 468729
1967114603 2057457401 6220662
1348842448 2958166969 78056914
1778128162 2080895021 163274337
1505246275 3774321295 135950317
1973335265 3318950790 264818067
611013034 4035712031 241028297
2894928213 2244169358 519295082
2626161330 1983393047 74064354
0 26087247 26320902

temperature-to-humidity map:
2565293924 3936499516 66436363
3537039881 3587821379 320595386
493156596 2133973986 271025354
2631730287 2862507138 166475062
3857635267 3531891893 55929486
2014053518 0 390945822
3340501666 4098429081 196538215
3198273266 4002935879 95493202
4210777967 3447702564 84189329
4119758949 2771488120 91019018
2826288100 3028982200 371985166
764181950 971110280 681277242
401253963 2042071353 91902633
2798205349 3908416765 28082751
3913564753 2565293924 206194196
1445459192 390945822 284651564
1730110756 1652387522 283942762
0 1936330284 105741069
105741069 675597386 295512894
3293766468 3400967366 46735198

humidity-to-location map:
2165947883 243164825 185957029
4117181009 1886348582 84328450
1977790778 3003241907 52295181
2621047317 2603926811 3541080
20358599 0 34147766
1910216465 2289280284 67574313
1435321221 2953430520 49811387
3565107101 532688453 509094142
231708454 3055537088 20702669
96040833 2127032834 135667621
2351904912 1321002996 61162541
3338550958 2262700455 26579829
3365130787 429121854 81629660
2723669224 4076568620 55137108
1823192023 3076239757 48333179
4074201243 2558055095 42979766
2413067453 1970677032 156355802
252411123 3815127871 123756213
1871525202 1209106389 38691263
0 34147766 20358599
2616053742 510751514 4993575
2599888132 4283810027 11157269
379059286 3938884084 132676195
569836988 3124572936 428164512
376167336 2601034861 2891950
3463703811 141761535 101403290
1043722202 4131705728 152104299
4201509459 3794875378 20252493
2163402773 1539347871 2545110
1686333106 1072247472 136858917
998001500 96040833 45720702
4221761952 1247797652 73205344
2030085959 1781387701 104960881
2569423255 1041782595 30464877
2135046840 3552737448 28355933
3446760447 515745089 16943364
2778806332 2607467891 345962629
1195826501 1541892981 239494720
1485132608 2356854597 201200498
2611045401 4071560279 5008341
3124768961 3581093381 213781997
511735481 1481246364 58101507
2624588397 1382165537 99080827"""

enum class Kind(val order: Int) {
    seed(0), soil(1), fertilizer(2), water(3), light(4), temperature(5),
    humidity(6), location(7)
}

data class Range constructor(val first: Long, val last: Long, val length: Long) {
    fun offset(delta: Long): Range {
        return fromStartAndLength(first + delta, length)
    }

    init {
        assert(last >= first && last == first + length - 1)
    }

    companion object {
        fun fromStartAndLength(start: Long, length: Long): Range {
            val to = start + length - 1
            return Range(start, to, length)
        }

        fun fromStartAndEnd(start: Long, end: Long): Range {
            val length = end - start + 1
            return Range(start, end, length)
        }
    }
}

data class TransformRow(val source: Range, val dest: Range) {
    val delta = dest.first - source.first

    init {
        assert(source.length == dest.length)
    }
}

data class GardenMap(val from: Kind, val to: Kind) {
    var transformRows = mutableListOf<TransformRow>()
}

data class Almanac(val seeds: List<Range>, val maps: Map<Kind, GardenMap>) {
    init {
        maps.values.forEach { it.transformRows.sortBy { it.source.first } }
    }
}

fun day5_Pascal() {

    fun parseRow(line: String): TransformRow {
        val parts = line.split(" ").map { it.toLong() }
        val destinationRangeStart = parts[0]
        val sourceRangeStart = parts[1]
        val rangeLength = parts[2]
        val sourceRange = Range.fromStartAndLength(sourceRangeStart, rangeLength)
        val destinationRange = Range.fromStartAndLength(destinationRangeStart, rangeLength)
        return TransformRow(sourceRange, destinationRange)
    }


    fun parseAlmanac(input: String, part: Int): Almanac {
        var seeds: List<Range>? = null
        var currentGardenMap: GardenMap? = null
        val gardenMaps = mutableMapOf<Kind, GardenMap>()
        input.lines().forEachIndexed() { i, line ->
            if (i == 0) {
                val numbers = line.split(": ")[1].split(" ").map { it.toLong() }
                seeds = if (part == 1) {
                    numbers.map { Range.fromStartAndEnd(it, it) }
                } else {
                    numbers.chunked(2).map {
                        val from = it.get(0)
                        val length = it.get(1)
                        Range.fromStartAndLength(from, length)
                    }
                }
            } else if (line.contains(":")) {
                val name = line.split(" ")[0].split("-to-")
                val from = Kind.valueOf(name[0])
                val to = Kind.valueOf(name[1])
                currentGardenMap = GardenMap(from, to)
                gardenMaps.set(from, currentGardenMap!!)
            } else if (line.length > 0) {
                currentGardenMap!!.transformRows.add(parseRow(line))
            }
        }
        return Almanac(seeds!!, gardenMaps)

    }

    fun findNextPosition(position: Long, rows: List<TransformRow>): Long {
        var min = 0
        var max = rows.size
        while (max >= min) {
            var mid = (min + max) / 2
            if (mid < 0 || mid >= rows.size) break
            var midVal = rows[mid]
            if (position < midVal.source.first) {
                max = mid - 1
            } else if (position <= midVal.source.last) {
                // we
                return position + midVal.delta
            } else {
                min = mid + 1
            }
        }
        return position
    }

    fun calculatePoints1(almanac: Almanac): Long {
        val locations = mutableListOf<Long>()
        almanac.seeds.forEach {
            val seed = it.first
            var position = seed
            for (k in Kind.entries) {
                //seed 79 > soil 81 > fertilizer 81 > water 81 > light 74 > temperature 78 > humidity 78 > location 82
                //seed 14 > soil 14 > fertilizer 14 <= 53
                print(k.name + " " + position)
                if (k == Kind.location) {
                    println()
                    break
                } else print(" > ")
                val map = almanac.maps.get(k)!!
                position = findNextPosition(position, map.transformRows)
            }
            locations.add(position)
        }
        return locations.min()
    }

    fun findNextRanges(sourceRanges: List<Range>, rows: List<TransformRow>): List<Range> {
        val result = mutableListOf<Range>()

        fun findNextPositions(currentRange: Range) {
            var first = currentRange.first;
            val last = currentRange.last

            fun addDestRange(sourceRange: Range, delta: Long) {
                result.add(sourceRange.offset(delta))
                first = sourceRange.last + 1
            }

            while (first <= last) {
                var minRowNo = 0
                var maxRowNo = rows.size
                val resultSizeBefore = result.size
                while (maxRowNo >= minRowNo) {
                    val searchRowNo = (minRowNo + maxRowNo) / 2
                    val searchRowVal = rows[searchRowNo]
                    if (first < searchRowVal.source.first) {
                        maxRowNo = searchRowNo - 1
                        if (maxRowNo < 0) {
                            // we're before the first range
                            val end = Math.min(last, searchRowVal.source.first - 1)
                            addDestRange(Range.fromStartAndEnd(first, end), 0)
                            break
                        };
                    } else if (first <= searchRowVal.source.last) {
                        // we're in the middle of a range
                        val end = Math.min(last, searchRowVal.source.last)
                        addDestRange(Range.fromStartAndEnd(first, end), searchRowVal.delta)
                        break
                    } else {
                        minRowNo = searchRowNo + 1
                        if (minRowNo >= rows.size) {
                            // we're after the last range
                            val end = last
                            addDestRange(Range.fromStartAndEnd(first, end), 0)
                            break
                        }
                    }
                }
                if (result.size == resultSizeBefore) {
                    // we haven't moved at all the range was not intersecting
                    addDestRange(currentRange, 0)
                }
            }
        }
        for (sourceRange in sourceRanges) {
            findNextPositions(sourceRange)
        }
        return result
    }


    fun calculatePoints2(almanac: Almanac): Long {
        val locations = mutableListOf<Long>()
        almanac.seeds.forEach {
            var ranges = listOf(it)
            val countBefore = ranges.sumOf { it.length }
            for (k in Kind.entries) {
                println(k.name + " " + ranges)
                if (k == Kind.location) break
                val map = almanac.maps.get(k)!!
                ranges = findNextRanges(ranges, map.transformRows)
                val countAfter = ranges.sumOf { it.length }
                assert(countAfter == countBefore)
            }
            val minPosition = ranges.minBy { it.first }.first
            locations.add(minPosition)
        }
        return locations.min()
    }

    fun day5Part1(input: String): Long {
        val almanac = parseAlmanac(input, 1)
        val result = calculatePoints1(almanac)
        return result
    }

    fun day5Part2(input: String): Long {
        val almanac = parseAlmanac(input, 2)
        val result = calculatePoints2(almanac)
        return result
    }
    println("  * Part 1")
    println("    sample data: ${day5Part1(day5PascalSampleDataPart1)}")
    println("    main data: ${day5Part1(day5PascalMainData)}")
    println("  * Part 2")
    println("    sample data: ${day5Part2(day5PascalSampleDataPart1)}")
    println("    main data: ${day5Part2(day5PascalMainData)}")

}