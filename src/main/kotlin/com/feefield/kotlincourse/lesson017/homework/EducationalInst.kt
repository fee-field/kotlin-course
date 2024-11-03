package com.feefield.kotlincourse.lesson017.homework

open class EducationalInst(
    val name: String,
    val numberOfStudents: Int,
    val age: List<Int>,
) {
    fun averageAge() : Double = age.average()
    fun printIfo() {
       val edu = "Educational Institution name is $name, the number of students is $numberOfStudents, the max age is ${averageAge().toInt()}"
        println(edu)
    }
}

open class School(
    name: String,
    numberOfStudents: Int,
    age: List<Int>,
    val specialization: String,
) : EducationalInst(name,numberOfStudents,age) {

    fun spec() : String {
        val spec1 = "Specialization is $specialization"
        println(spec1)
        return(spec1)
    }
}

class College(
    name: String,
    numberOfStudents: Int,
    age: List<Int>,
    val degree: String,
) : EducationalInst(name,numberOfStudents,age) {

}

class PreSchool(
    name: String,
    numberOfStudents: Int,
    age: List<Int>,
    specialization: String,
) : School(name,numberOfStudents,age, specialization) {

}



