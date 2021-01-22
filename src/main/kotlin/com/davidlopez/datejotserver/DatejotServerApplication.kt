package com.davidlopez.datejotserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DatejotServerApplication

fun main(args: Array<String>) {
	runApplication<DatejotServerApplication>(*args)
}
