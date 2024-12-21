package com.feefield.kotlincourse.lesson031.homework

import kotlin.math.min

// !!!!! Для проверяющего: в Test ниже по дереву есть CerealStorageImplTest, там тесты

//Создай реализацию представленного ниже интерфейса с пустыми методами
//Создай тестовый класс для твоей реализации.

class CerealStorageImpl1(
    override val containerCapacity: Float,
    override val storageCapacity: Float
) : CerealStorage {

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
        require(amount >= 0) {
            "Количество крупы не может быть отрицательным"
        }
        checkStorageCapacity(cereal)
        val currentAmount = storage.getOrDefault(cereal, 0f)
        val amountForAdding = min(getSpace(cereal), amount)
        storage[cereal] = currentAmount + amountForAdding
        return amount - amountForAdding
    }

    override fun getCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) {
            "Количество крупы не может быть отрицательным"
        }
        val currentAmount = storage[cereal] ?: 0f // без элвиса ошибка ниже
        return if (currentAmount >= amount) {
            amount
        } else {
            currentAmount
        }
    }

    override fun removeContainer(cereal: Cereal): Boolean {
        val currentAmount = storage[cereal]
        if (currentAmount == 0f) {
            storage.remove(cereal)
            return true
        }
        return false
    }

    override fun getAmount(cereal: Cereal): Float {
        return storage.getOrDefault(cereal, 0f)
    }

    override fun getSpace(cereal: Cereal): Float {
        return containerCapacity - getAmount(cereal)
    }

    override fun toString(): String {
        return "В вашем контейнере места: $containerCapacity, а в хранилище $storageCapacity."
    }

    private fun checkStorageCapacity(cereal: Cereal) {
        if (storage.contains(cereal)) return
        check(storageCapacity >= (storage.size + 1) * containerCapacity) {
            "Недостаточно места в хранилище для нового контейнера"
        }
    }
}




