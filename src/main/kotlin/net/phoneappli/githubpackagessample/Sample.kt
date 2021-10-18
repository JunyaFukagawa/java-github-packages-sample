package net.phoneappli.githubpackagessample

import com.fasterxml.jackson.databind.ObjectMapper


class Sample {
    fun printJacksonVersion() {
        val mapper = ObjectMapper()
        println(mapper.version())
    }
}
