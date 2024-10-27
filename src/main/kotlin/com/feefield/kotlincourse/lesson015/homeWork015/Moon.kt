package com.feefield.kotlincourse.lesson015.homeWork015

//Природное явление: Луна Создайте объект Moon, который будет представлять Луну. Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент, и phase (String), чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon"). Добавьте метод showPhase(), который выводит текущую фазу Луны.

class Moon(
    val isVisible: Boolean,
    val phase: String
) {
    fun showPhase() {
        if(isVisible) {
            println("The moon phase is: $phase")
        } else {
            println("The moon phase is: $phase")
        }
    }
}