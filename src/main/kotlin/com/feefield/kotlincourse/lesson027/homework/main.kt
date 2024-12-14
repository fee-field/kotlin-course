package com.feefield.kotlincourse.lesson027.homework


fun main() {
    // Task 1
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    val time = timeTracker(myFunction)
    println(time)

    // Task 2

    val empl1 = Employee("Name1", 50, "QA").apply {
        email = "test@test.com"
        department = "Testing"
    }

    // Task 3

    val pers3 = Person("Name2", 25).also {
        also1(it)
    }

    // Task 4

    val pers4 = Person("Name3", 41)
    val emp2 = with(pers4) {
        Employee(name, age, "Team lead")
    }
println(emp2)

    // Task 5

    val pers5 = Person("Name4", 37)

    val empl3 = pers5.run {
        Employee(name, age, "HR").apply {
            email = "test@test.com"
            department = "Testing"
        }
    }
    println(empl3)

    // Task 6

    val pers6: Person? = Person("Name6", 55)
    val empl6 = let1(pers6)
    println(empl6)
}

//Task 1
//Создайте функцию timeTracker, которая принимает другую функцию в качестве
// аргумента и измеряет время её выполнения. Функция timeTracker должна
// возвращать затраченное время в миллисекундах. Для измерения времени
// используйте System.currentTimeMillis() до и после выполнения переданной функции.

fun timeTracker(arg1: () -> List<Int>): Long {
    val start = System.currentTimeMillis()
    arg1()
    val end = System.currentTimeMillis()
    val result = start - end
    return result
}

//Task 2
//Задание 2: Использование apply для инициализации объекта Employee
//Создайте объект Employee и используйте apply для инициализации его полей email и department.

//Задание 3: Использование also для логирования
//Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в
// красивом, отформатированном виде.
//Создайте объект Person и используйте also для печати данных в консоль с помощью метода
// который только что создали.

class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

// Task 3

fun also1(arg1: Person) {
    println("The name of the Person is: ${arg1.name}")
    println("The age of the Person is: ${arg1.age}")
}

//Задание 4: Использование with для преобразование Person в Employee
//Создайте объект класса Person. Используйте функцию with, чтобы создать
// из этого объекта Employee, указав дополнительно должность. Возвращаемым
// значением должен быть новый объект Employee.

//Задание 5: Использование run для преобразования и инициализации Employee
//Создайте объект класса Person. Используйте функцию run, чтобы
// инициализировать объект Employee, добавить ему email и department с
// помощью apply, вернуть инициализированный объект.

//Задание 6: Использование let для безопасного преобразования Person в
// Employee
//Создайте функцию, которая принимает объект класса Person?, который
// может быть null. В функции используйте функцию let для создания Employee,
// только если объект Person не null. В противном случае возвращается null

fun let1(arg1: Person?) : Employee? {
    return arg1?.let {
        Employee(it.name, it.age, "Dev")
    }
}


