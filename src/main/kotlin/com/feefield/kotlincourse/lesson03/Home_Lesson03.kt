package com.feefield.kotlincourse.lesson03

import com.feefield.kotlincourse.lazyValue
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Duration

// Hackathon Survival

// Название мероприятия: string

// -- изменяемость: no >> const val or val
// -- обязательность: yes >> val
//-- возможность начальной установки: yes >> not lateinit, not var, not nullable
//-- ресурсоёмкие вычисления значения: no >> not lazy
//-- необходимость проверки: no >> val + validate on init
//-- запрет доступа на установку: yes >> val (once set not editable afterwards)
//-- публичность: read-only >> val?

const val EVENT: String = "Event Name"

// Дата проведения:

var date: LocalDateTime = LocalDate.of(2025,1,1)

// Место проведения:

val venue: String = "Address Line 1, Town, Country"

// Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы:
    //MutableMap<Key, Value>; MutableList - val for lists

var detailedBudget: MutableMap <String, Double> = mutableMapOf("Equipment Expenses" to 20000.0,
    "Catering" to 10000.0, "Other" to 50000.0)

// Количество участников:
    //изменяемое и в -, и в +, включает проверку на максимальное количество участников и на не отрицательное значение
    // итоговое значение: && - и, || - или

const val MAX_NUMBER_OF_PARTICIPANTS: Int = 1000

var numberOfParticipants: Int = 800
    get() = field
    set(value) {
        if (field + value < 0 && field + value <= MAX_NUMBER_OF_PARTICIPANTS) {
            field += value
        }
       }
// или расписать два if-else с уменьшением количества участников


// Длительность хакатона:
// Duration Java и Duration Kotlin??

var eventDuration: Duration = Duration.ofMinutes(480)

// Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг:
// неизменяемые пары ключ-значение

val supplier1: String = "Tel #, Terms of Agreement, Price. etc."
val supplier2: String = "Tel #, Terms of Agreement, Price. etc."
val supplier3: String = "Tel #, Terms of Agreement, Price. etc."

//or

val suppliers: MutableMap <String, String> = mutableMapOf(
    "Supplier1" to "Tel #, Terms of Agreement, Price. etc.",
    "Supplier2" to "Tel #, Terms of Agreement, Price. etc.",
    "Supplier3" to "Tel #, Terms of Agreement, Price. etc.",
)

// Текущее состояние хакатона (статус):
// изменяемое, одно из заданных - ?

var currentStatus: String = "Planned"

// Список спонсоров:
// неизменяемый список спонсоров без других параметров, list

val sponsors: List<String> = listOf("Sponsor1", "Sponsor2", "Sponsor3")


// Бюджет мероприятия:
    // если расходы растут, просто +- значение?

var totalBudget: Double = 80000.0

// План эвакуации:

val evacuationPlan: String = "Instructions"

//or

val evacuationSteps: List<String> = listOf("go there","turn there","stop there")

// Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия:
// возможность начальной установки: нет, используем nullable или lateinit

lateinit var specialGuestName: String

//Текущий уровень доступа к интернету
//есть или нет

var internetAccess: Boolean = false

//Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
// im(?)mutable map с парами key-value или просто инструкции в виде list

var specialInfo: Map<String, String> = mapOf("Траспортировка оборудования" to "Тогда-то", "распределение ресурсов" to "на то, на это")

// Количество команд

var numberOfTeams: Int = 6

// Перечень задач
// immutable list

val task: List<String> = listOf("task1", "task2", "task3")

//Список доступного оборудования

var availableEquipment: MutableMap<String, Boolean> = mutableMapOf("Equipment1" to true, "Equipment2" to false )
    get() = field
    set(value) {
    if (isAccessible()) { field = value }
  //      else ??? print?? "Not Accessible"
}

//Список свободного оборудования

//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
// то же, что и со Special Guest - lateinit

lateinit var mealSchedule: MutableMap<String, String>

//План мероприятий на случай сбоев

val contingencyPlan: List<String> by lazy {
    listOf("step1", "step2", "step3")
}

//Текущая температура в помещении

var currentTemperature: Double = 23.0

//Доступность медицинской помощи

var ambulanceAvailability: Boolean = true


// Максимально допустимый уровень шума в помещении хакатона

public const val MAX_NOISE_LEVEL: Int = 40
//public потому что в следующем пункте идет отсылка на эту переменную


// Индикатор превышения уровня шума в помещениях

var noiseLevel: Int = 0
    get() = field
    set(value) {
        if (value > MAX_NOISE_LEVEL) {
            field = value - MAX_NOISE_LEVEL
        }
    }


// Лог событий мероприятия
// mutable list - события постоянно добавляются (? какая разница, val или var для mutable list и map?)

val activityLog: MutableList<String> = mutableListOf("event1", "event2", "event3", "event4", "event5", "event6")


// План распределения призов
// mutable map, чтобы в value указать, кому приз - как сгруппировать?

val prizeDistribution: MutableMap<String, String> = mutableMapOf(
    "prize1" to "person1")

// Статус получения всех необходимых разрешений

var accessStatus: Boolean = true
    get() = field
    set(value) {
         if (isAccesible()) {
             field = value
         }
}
