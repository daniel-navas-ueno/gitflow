package com.gitflow.gitflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitflowApplication

fun main(args: Array<String>) {
    runApplication<GitflowApplication>(*args)
    // Cambios
    val one = Integer.valueOf("1")
    val two = Integer.valueOf("2")
    val thee = Integer.valueOf("3")
    val four = Integer.valueOf("4")
    println("Suma: " + (one + two))
}
