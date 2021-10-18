package net.phoneappli.githubpackagessample

import com.fasterxml.jackson.databind.ObjectMapper




class Sample {
    fun printJson() {
        val mapper = ObjectMapper()
        val json = mapper.writeValueAsString(Hoge("Hello", "World"))
        println(json)
    }
}

class Hoge(val value1: String, val Value2: String)
