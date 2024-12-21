package com.feefield.kotlincourse.classWork

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.time.OffsetDateTime

//data class Address(
//    val street: String,
//    val city: String,
//    val postalCode: Int
//)
//
//data class User(
//    val id: Int,
//    val name: String,
//    val isActive: Boolean,
//    val address: Address
//)

//fun main() {
//    val address = Address("Baker Street", "London", 221)
//    val user = User(1, "Sherlock Holmes", true, address)
//
//    val gson = Gson() // Создаём экземпляр Gson
//    val json = gson.toJson(user) // Сериализация объекта
//    println("JSON: $json")
//
//    val user1: User = gson.fromJson(json, User::class.java) // Десериализация JSON в объект
//    println("User: $user1")
//
//    val gson1 = GsonBuilder()
//        .setPrettyPrinting() // Для красивого форматирования JSON
//        .serializeNulls() // Включить null-поля в JSON
//        .create()


data class University(
    val name: String,
    val foundationYear: Int,
    val isPublic: Boolean,
    val faculties: List<Faculty>
)

data class Faculty(
    val name: String,
    val dean: String,
    val establishedYear: Int,
    val students: List<Student>
)

data class Student(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val major: String?,
)

fun main() {

    val student1 = Student("John", "Doe", 20, "Computer Science")
    val student2 = Student("Jane", "Doe", 19, null)

    val faculty = Faculty("Engineering", "Dr. Smith", 1965, listOf(student1, student2))

    val university = University("Tech University", 1905, true, listOf(faculty))

    val gson = GsonBuilder().setPrettyPrinting().create() // Создаём экземпляр Gson
    val json = gson.toJson(university) // Сериализация объекта
    println(json)

    val deserial1 = gson.fromJson(json, University::class.java)
    println(deserial1)

}

class Calculator() {
    fun plus(a: Int, b: Int) = a + b
}