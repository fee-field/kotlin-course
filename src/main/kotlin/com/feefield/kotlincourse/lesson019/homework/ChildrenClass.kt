package com.feefield.kotlincourse.lesson019.homework

abstract class BaseClass(
    // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass  -----
    // не это же, private не может быть доступно за пределами этого класса
    private val privateVal: String,
    // объясни, почему это поле недоступно в main()
    // protected доступны только для класса и наследников, не main
    protected val protectedVal: String,
    val publicVal: String
) {

    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
    private var privateField = "добавь сеттер чтобы изменить меня из main()"

    fun setPrivateField(value: String) {
        privateField = value
    }

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // объясни, почему эта функция не может быть публичной ---- иначе объект protected класса стал бы открыт для внешнего кода
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // объясни, почему эта функция не может быть публичной или protected
    // так же история + не могут видеть наследники
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass
}


class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // унаследован как публичный из base
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    //    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
    //            "Доработай ChildrenClass таким образом, чтобы это получилось"

    override fun verifyPublicField(value: String): Boolean {
        return true
    }

//    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
    fun setProtectedField1 (value: String) {
        protectedField = value
    }

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет ---- унаследована от Base

    // проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
}

