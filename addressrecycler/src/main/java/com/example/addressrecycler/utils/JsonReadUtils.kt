package com.example.addressrecycler.utils

import android.content.Context
import java.io.*

class JsonReadUtils private constructor() {

    private object StreamUtilsInstance {
        val jsonReadUtils = JsonReadUtils()
    }

    companion object {
        fun getInstance(): JsonReadUtils {
            return StreamUtilsInstance.jsonReadUtils
        }
    }

    fun get(context: Context, id: Int): String {
        val stream = context.resources.openRawResource(id)
        return read(stream)
    }

    fun read(stream: InputStream): String {
        return read(stream, "utf-8")
    }

    fun read(inputStream: InputStream, encode: String): String {
        if (inputStream != null) {
            try {
                val reader = BufferedReader(InputStreamReader(inputStream, encode))
                var line = reader.readLine()
                var result = ""
                while (line != null) {
                    result += line
                    line = reader.readLine()
                }
                inputStream.close()
                return result
            } catch (e: UnsupportedEncodingException) {
                e.printStackTrace()
            } catch (e: IOException) {
                e.printStackTrace()
            }

        }
        return ""
    }

}