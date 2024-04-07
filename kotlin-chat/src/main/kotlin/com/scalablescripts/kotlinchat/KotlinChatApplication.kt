package com.scalablescripts.kotlinchat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinChatApplication

fun main(args: Array<String>) {
	runApplication<KotlinChatApplication>(*args)
}
