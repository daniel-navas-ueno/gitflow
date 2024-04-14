package com.gitflow.gitflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitflowApplication

fun main(args: Array<String>) {
    runApplication<GitflowApplication>(*args)
    val one = Integer.valueOf("1")
    val two = Integer.valueOf("2")
    println("Suma: " + (one + two))
}