package com.gitflow.gitflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitflowApplication

fun main(args: Array<String>) {
    runApplication<GitflowApplication>(*args)
    // Cambios
    val one = 1
    val two = 2
    val thee = 3
    val four = 4
    println("Suma: " + (one + two))
}
