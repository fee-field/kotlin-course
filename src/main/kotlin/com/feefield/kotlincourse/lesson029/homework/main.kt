package com.feefield.kotlincourse.lesson029.homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun main() {

//Создай текущую временнУю метку и выведи её на печать (чтобы ещё раз запомнить название этого класса)

    val instant = Instant.now()
    println(instant)

//Создай дату своего дня рождения.

    val birthday = LocalDate.of(1900, 1, 1)

//Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.
    val currentDate = LocalDate.now()
    val period = Period.between(birthday, currentDate)
    println(period.years)

    val localDate = LocalDate.now()
    formatAnyDate(localDate)
    val localTime = LocalTime.now()
    formatAnyDate(localTime)
    val localDateTime = LocalDateTime.now()
    formatAnyDate(localDateTime)
    val zonedDateTime = ZonedDateTime.now()
    formatAnyDate(zonedDateTime)
    val offsetDateTime = OffsetDateTime.now()
    formatAnyDate(offsetDateTime)

    formatAnyDateByIso(localDate)
//    formatAnyDateByIso(localTime)
    formatAnyDateByIso(localDateTime)
    formatAnyDateByIso(zonedDateTime)
    formatAnyDateByIso(offsetDateTime)


// Создай объекты дат и / или времени которые мы изучили и по очереди передай
// их в метод созданный выше. Не используй в них метод now()
    // всегда читай следующее задание :)))

    val localDate1 = LocalDate.of(2000, 2, 5)
    formatAnyDate(localDate)
    val localTime1 = LocalTime.of(4, 8, 35)
    formatAnyDate(localTime)
    val localDateTime1 = LocalDateTime.of(1888, 7, 28, 23, 45)
    formatAnyDate(localDateTime)
    val zonedDateTime1 = ZonedDateTime.of(1700, 2, 15, 12, 47, 44, 0, ZoneId.of("Europe/Warsaw"))
    formatAnyDate(zonedDateTime)
    val offsetDateTime1 = OffsetDateTime.of(1256, 4, 5, 22, 36, 25, 0, ZoneOffset.ofHours(3))
    formatAnyDate(offsetDateTime)


    // Task 6

    val boomer = LocalDate.of(1958, 11, 1)
    identifyGeneration(boomer)
    val zoomer = LocalDate.of(2010, 11, 1)
    identifyGeneration(zoomer)
    val none = LocalDate.of(1900, 11, 1)
    identifyGeneration(none)

//Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года. Создай форматтер, который
// форматирует дату в месяц и день.
//Выведи первую отформатированную дату, прибавив к ней 10 дней.
//Выведи вторую отформатированную дату, прибавив к ней 10 дней.
//Найди отличия)))

    val date1 = LocalDate.of(2023, 2, 25)
    val date2 = LocalDate.of(2024, 2, 25)
    val formatter1 = DateTimeFormatter.ofPattern("'месяц' MM',  день' dd")
    println("${date1.plusDays(10).format(formatter1)}")
    println("${date2.plusDays(10).format(formatter1)}")

}
//Создайте функцию identifyGeneration, которая принимает дату рождения в формате LocalDate и
// печатает строку,

private val boomerFromDate = LocalDate.of(1945, 12, 31)
private val boomerEndDate = LocalDate.of(1965, 1, 1)
private val zoomerStartDate = LocalDate.of(1996, 12, 31)
private val zoomerEndDate = LocalDate.of(2013, 1, 1)

fun identifyGeneration(date: LocalDate) {
    when {
        date.isAfter(boomerFromDate) && date.isBefore(boomerEndDate) -> "Бумер"
        date.isAfter(zoomerStartDate) && date.isBefore(zoomerEndDate) -> "Зумер"
        else -> "Не определено"
    }.also { println(it) }
}

//Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того,
//содержит ли аргумент время и часовой пояс.

fun formatAnyDate(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ofPattern("MM=!!!dd=&&&yyyy"))
        is LocalTime -> temporal.format(DateTimeFormatter.ofPattern("HH HH HH HH :  mm:ss"))
        is LocalDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy yyyy -MM-dd dd HH:mm:ss"))
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy%%%MM%%%dd HH:mm:ss"))
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ofPattern("yyyy-----MM-------dd HH:mm:ss ZZZ"))
        else -> temporal.toString()
    }.also { println(it) }
}

fun formatAnyDateByIso(temporal: Temporal) {
    when (temporal) {
        is LocalDate -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)
        is LocalTime -> temporal.format(DateTimeFormatter.ISO_DATE_TIME)
        is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        else -> temporal.toString()
    }.also { println(it) }
}

