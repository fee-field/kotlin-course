package com.feefield.kotlincourse.lesson031.homework

import com.feefield.kotlincourse.classWork.University
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

enum class CharacterTypes {
    CTO,
    UX_UI,
    CRM, // Customer Relationship Manager
    GAME_DEV,
    TEAM_LEAD,
    BACKEND_DEV,
    PM,
    SYSADMIN,
    QA
}

data class Employee2(
    val name: String,
    val employedOrNot: Boolean,
    val dateOfBirth: String,
    val jobTitle: CharacterTypes,
    val subordinates: List<Employee2>
)

fun main() {


    val dev2 = Employee2("Brown", true, "February, 29, 1988", CharacterTypes.GAME_DEV, listOf())
    val designer = Employee2("Bonnie", true, "July, 7, 1990", CharacterTypes.UX_UI, listOf())
    val qa = Employee2("Benny", true, "August, 15, 2000", CharacterTypes.QA, listOf())
    val dev1 = Employee2("Billy", true, "October, 5, 1980", CharacterTypes.BACKEND_DEV, listOf())
    val CTO = Employee2("Bob", true, "December, 14, 1970", CharacterTypes.CTO, listOf(dev1, dev2, qa, designer))


    val gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(CTO)
    println(json)

    val file = File("CTO.json")
    file.writeText(json)

    val readFile = file.readText()
    val deserial2 = gson.fromJson(readFile, Employee2::class.java)
    println(deserial2)
}