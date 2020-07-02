package com.jjh.exp.test

import com.jjh.exp.set.SetException
import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

class ExceptionExample {

    @Throws(SetException::class)
    fun save(filename: String) {
        println("Entering save() method")
        try {
            println("Starting to save data to file")
            saveDataToFile(filename)
            println("Completed saving data")
        } catch (e: NullPointerException) {
            e.printStackTrace()
        } finally {
            println("In finally")
        }
        println("Existing save() method")
    }

    @Throws(SetException::class)
    private fun saveDataToFile(filename: String) {
        // FileWriter fw = new FileWriter(filename);
        throw SetException(123, "In here")
        // throw new FileNotFoundException("John was here");
//        BufferedWriter bw = new BufferedWriter(fw);
//        PrintWriter pw = new PrintWriter(bw);
//        pw.print("hello world");
//        pw.close();
    }

    @Throws(IOException::class)
    fun readFirstLineFromFile(filename: String?): String {
        BufferedReader(FileReader(filename)).use { br -> return br.readLine() }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ee = ExceptionExample()
            ee.save("temp.txt")
        }
    }
}