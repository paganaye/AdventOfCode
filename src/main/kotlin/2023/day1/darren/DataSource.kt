package `2023`.day1.darren

import java.io.BufferedReader
import java.io.File

object DataSource {

    fun getAsString(): String {
        val bufferedReader: BufferedReader = File("")
            .absoluteFile.resolve("src\\main\\kotlin\\2023\\day1\\trebuchet-input")
            .bufferedReader()
        return bufferedReader.use { it.readText() }
    }
}