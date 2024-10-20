package com.feefield.kotlincourse.lesson014

fun main() {

//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.

    val mapTestDuration = mapOf<String, Int>("the first" to 500, "the second" to 300)
    println(mapTestDuration.values.average())

//Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными.
// Выведите список всех тестовых методов.

    val metaData = mapOf<String,String>("method 01" to "metadata 01", "method 02" to "metadata 02")
    println(metaData.keys)

//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.

    val results = mutableMapOf("the first test" to "Passed", "the second test" to "Failed")
    val newResults = results + ("the third test" to "Not Started") + ("the 4th test" to "Passed")
    println(newResults)

//Посчитайте количество успешных тестов в словаре с результатами.

    val passedTests = newResults.count { it.value == "Passed" }
    println(passedTests)

//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.

    val bugs = mutableMapOf(1 to "description 01", 2 to "description 02", 3 to "description 03")
    val fixedBug = bugs.remove(2)
    println(bugs)

//Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение
// о странице и статусе её проверки.

    val resultsWebTesting = mapOf("/url1" to 200, "/url2" to 404, "/url3" to 500 )
//    println(resultsWebTesting.map {"Page: ${it.key} >> result: ${it.value}"})
    println(resultsWebTesting.getValue ("/url1"))

//Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.

    val responseTime = mapOf("WS01" to 300, "WS02" to 150, "WS03" to 10)
    println(responseTime.filterValues { it > 100 })

//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.

    val resultsAPI = mapOf("/endpoint01" to 200, "/endpoint02" to 500, "/endpoint03" to 403)
    println(resultsAPI.getOrElse("/endpoint04") { println("not tested")})
    println(resultsAPI.getOrElse("/endpoint03") { println("not tested")})

//Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации), получите значение для
// "browserType". Ответ не может быть null.

    val config = mapOf("config01" to 1, "browserType" to 2, "config03" to 3)
    println(config.getValue("browserType"))

//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.

    val versions = mapOf("name01" to "Version01", "name02" to "Version02")
    val versionsCopy = versions.toMutableMap()
    versionsCopy["name03"] = "Version03"
    println(versionsCopy)

//Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
// получите настройки для конкретной модели или верните настройки по умолчанию.

    val crossPlatform = mapOf("model01" to "setup01", "model02" to "setup02", "model03" to "setup03")
    println(crossPlatform.getOrDefault("model01", "default setup"))
    println(crossPlatform.getOrDefault("model010", "default setup"))

//Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.

    println(bugs.filter({it.key == 3 }))

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы
// выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы
// которых соответствуют определённой версии тестов.

    val scripts = mapOf("1_01" to "Passed", "2_02" to "Failed", "3_03" to "Skipped")
    println(scripts.containsKey("1_01" ))

//У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
// Проверьте, есть ли модули с неудачным тестированием.

    val modules = mapOf("title01" to "Passed", "title02" to "Failed", "title03" to "Failed")
    println(modules.containsValue("Passed"))

//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.

    val setup = mutableMapOf("setup01" to "config01", "setup02" to "config02")
    setup.putAll(mapOf("setup03" to "config03"))
    println(setup)

//Объедините два неизменяемых словаря с данными о багах.

    val map01 = mapOf(1 to "description 01", 2 to "description 02", 3 to "description 03")
    val map02 = mapOf(4 to "description 04", 5 to "description 05")
    val conjMap = map01 +  map02
    println(conjMap)

//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.

    val testRuns = mutableMapOf("test01" to "01/01/2024", "test02" to "01/02/2024", "test03" to "01/03/2024")
    testRuns.clear()
    println(testRuns)

//Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)

    val runResults = mapOf("1_01" to "Passed", "2_02" to "Failed", "3_03" to "Skipped")
    println(runResults.filterNot { it.value == "Skipped" })

//Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.
    //    val config = mapOf("config01" to 1, "browserType" to 2, "config03" to 3)

    val newConfig = config - "config01"
    println(newConfig)

//Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста,
// значение — результат) в список строк формата "Test ID: результат".
    //    val modules = mapOf("title01" to "Passed", "title02" to "Failed", "title03" to "Failed")

    println(modules.map{"${it.key}: ${it.value}"})

//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.

    val runResults01 = runResults.toMap()
    println(runResults01)

//Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их названия
// (название можно получить вызвав фейковый метод, например getNameById(id: String))
    //    val mapTestDuration = mapOf<String, Int>("the first" to 500, "the second" to 300)
    val testDuration = mapOf<String, Int>("ID01" to 500, "ID02" to 300, "ID03" to 5)
    testDuration.forEach{ (id, duration ) ->
//        println("${id} : ${getNameById(id: String)}")
        println("${id} : name")
    }


//Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%, чтобы учесть новые
// условия тестирования.

    val perf = mapOf("version01" to 100, "version02" to 200, "version03" to 70)
    val perfImpr = perf.mapValues { it.value * 1.1 }
    println(perfImpr)

//Проверьте, пуст ли словарь с ошибками компиляции тестов.

    val comp = mapOf<String, String>()
    println(comp.isEmpty())

//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.

    val loadTests = mapOf<String, String>("1" to "2")
    println(loadTests.isNotEmpty())

//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.

    val resultsAutoTests = mapOf("test01" to "Passed", "test02" to "Passed", "test03 optional" to "Failed")
    println(resultsAutoTests.all{it.value == "Passed"})

//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.

    println(resultsAutoTests.any{it.value == "Failed"})

//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат
// в названии “optional”.

    println(resultsAutoTests.filterKeys { it.contains("optional") })

}