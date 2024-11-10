package com.feefield.kotlincourse.lesson019

import com.feefield.kotlincourse.lesson019.homework.ChildrenClass
import com.feefield.kotlincourse.lesson019.homework.SlotMachine

fun main() {

    var slotMachine00 = SlotMachine("red", "Model 01", false, false, mutableListOf("poker", "tetris"), true, 0.0,"Owner01")
    slotMachine00.turnOn()
    println(slotMachine00.color)


    val childrenClass = ChildrenClass(
        "privateVal1",
        "protectedVal2",
        "publicVal3",
    )

    childrenClass.publicField = "Антонио Бандерас"
    println(childrenClass.publicField)

    childrenClass.setProtectedField1("new Protected Field")
    childrenClass.setPrivateField("new Private field")
    childrenClass.printText()
//    childrenClass.privatePrint()


    println(childrenClass.getAll())





}