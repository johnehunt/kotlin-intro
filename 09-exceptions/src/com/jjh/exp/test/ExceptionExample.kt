package com.jjh.exp.test

import com.jjh.exp.config.ConfigFileException
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException

class ExceptionExample {

    @Throws(ConfigFileException::class)
    fun save(filename: String) {
        println("Entering save() method")
        try {
            println("Starting to save data to file")
            saveDataToFile(filename)
            println("Completed saving data")
        } catch (e: NullPointerException) {
            e.printStackTrace()
        } catch (exp: FileNotFoundException) {
            exp.printStackTrace()
        } catch (exp: Exception) {
            exp.printStackTrace()
        } finally {
            println("In finally")
        }
        println("Existing save() method")
    }

    @Throws(ConfigFileException::class)
    fun saveDataToFile(filename: String) {
        // FileWriter fw = new FileWriter(filename);
        throw ConfigFileException(123, "No config file $filename found")
        // throw new FileNotFoundException("John was here");
//        BufferedWriter bw = new BufferedWriter(fw);
//        PrintWriter pw = new PrintWriter(bw);
//        pw.print("hello world");
//        pw.close();
    }

    // @Throws(IOException::class) - optionally indicate exception
    fun readFirstLineFromFile(filename: String?): String {
        BufferedReader(FileReader(filename)).use { br -> return br.readLine() }
    }

}

// Run the application
fun main(args: Array<String>) {
    val ee = ExceptionExample()
    ee.save("temp.txt")
}