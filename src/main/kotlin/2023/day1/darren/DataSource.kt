package `2023`.day1.darren

import java.io.BufferedReader
import java.io.File
import java.nio.file.Paths

object DataSource {

    fun getAsString(): String {
        val baseDir = File(".").absoluteFile // gets the current directory
        val relativePath = Paths.get("src", "main", "kotlin", "2023", "day1", "darren", "trebuchet-input").toString()
        val bufferedReader: BufferedReader = File(baseDir, relativePath).bufferedReader()
        return bufferedReader.use { it.readText() }
    }
}