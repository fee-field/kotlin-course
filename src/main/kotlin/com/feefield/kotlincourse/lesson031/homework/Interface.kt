package com.feefield.kotlincourse.lesson031.homework

interface CerealStorage {

    /**
     * Объём одного контейнера
     * @throws IllegalArgumentException если значение отрицательное при инициализации
     */
    val containerCapacity: Float

    /**
     * Совокупный объём хранилища
     * @throws IllegalArgumentException если значение меньше, чем [containerCapacity] при инициализации
     */
    val storageCapacity: Float

    /**
     * @param cereal крупа для добавления в контейнер
     * @param amount количество добавляемой крупы
     * @return количество оставшейся крупы если контейнер заполнился
     * @throws IllegalArgumentException если передано отрицательное значение
     * @throws IllegalStateException если хранилище не позволяет разместить ещё один контейнер для новой крупы
     */
    fun addCereal(cereal: Cereal, amount: Float): Float

    /**
     * @param cereal крупа, которую нужно взять из контейнера
     * @param amount количество крупы
     * @return количество полученной крупы или остаток, если было меньше
     * @throws IllegalArgumentException если передано отрицательное значение
     */
    fun getCereal(cereal: Cereal, amount: Float): Float

    /**
     * @param cereal уничтожает пустой контейнер
     * @return true если контейнер уничтожен и false если контейнер не пуст
     */
    fun removeContainer(cereal: Cereal): Boolean

    /**
     * @param cereal крупа, количество которой нужно узнать
     * @return количество крупы, которое хранится в контейнере
     */
    fun getAmount(cereal: Cereal): Float

    /**
     * @param cereal крупа, для которой нужно проверить доступное место в контейнере
     * @return количество крупы, которое может вместить контейнер с учётом его текущей заполненности
     */
    fun getSpace(cereal: Cereal): Float

    /**
     * @return текстовое представление
     */
    override fun toString(): String
}

enum class Cereal(local: String) {
    BUCKWHEAT("Гречка"),
    RICE("Рис"),
    MILLET("Пшено"),
    PEAS("Горох"),
    BULGUR("Булгур")
}


// Пример имплементации интерфейса с блоком инициализации класса

class CerealStorageImpl(
    override val containerCapacity: Float,
    override val storageCapacity: Float
) : CerealStorage {


    // Блок инициализации класса. Выполняется сразу при создании объекта
    init {
        require(containerCapacity >= 0) {
            "Ёмкость контейнера не может быть отрицательной"
        }
        require(storageCapacity >= containerCapacity) {
            "Ёмкость хранилища не должна быть меньше ёмкости одного контейнера"
        }
    }

    private val storage = mutableMapOf<Cereal, Float>()
    override fun addCereal(cereal: Cereal, amount: Float): Float {
        TODO("Not yet implemented")
    }

    override fun getCereal(cereal: Cereal, amount: Float): Float {
        TODO("Not yet implemented")
    }

    override fun removeContainer(cereal: Cereal): Boolean {
        TODO("Not yet implemented")
    }

    override fun getAmount(cereal: Cereal): Float {
        TODO("Not yet implemented")
    }

    override fun getSpace(cereal: Cereal): Float {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        TODO("Not yet implemented")
    }

    // дальше будет переопределением методов интерфейса
}
