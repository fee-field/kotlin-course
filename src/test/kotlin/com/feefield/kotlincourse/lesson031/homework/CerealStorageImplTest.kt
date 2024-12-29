package com.feefield.kotlincourse.lesson031.homework

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class CerealStorageImplTest {

    private lateinit var storage: CerealStorage

    @BeforeEach
    fun setup() {
        val storage = CerealStorageImpl(10f, 20f)
    } // убрала private, добавила lateinit - так и надо было??

    @Test
    fun `should throw if containerCapacity is negative`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(-4f, 10f)
        }
    }

    @Test
    fun `should throw if storageCapacity is lower than containerCapacity`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(10f, 9.9f)
        }
    }
    // addCereal

    @Test
    fun addCereal() = with(storage) {
        addCereal(Cereal.RICE, 2.2f)
        Assertions.assertEquals(2.2f, getAmount(Cereal.RICE))
    }

    @Test
    fun addExtraCereal() = with(storage) {
        addCereal(Cereal.RICE, 2.2f)
        addCereal(Cereal.RICE, 1.3f)
        Assertions.assertEquals(3.5f, getAmount(Cereal.RICE))
    }

    @Test
    fun addMultipleCereal() = with(storage) {
        addCereal(Cereal.RICE, 1.1f)
        addCereal(Cereal.PEAS, 2.7f)
        Assertions.assertAll(
            { Assertions.assertEquals(1.1f, getAmount(Cereal.RICE)) },
            { Assertions.assertEquals(2.7f, getAmount(Cereal.PEAS)) }
        )
    }

    // getCereal

    @Test
    fun `возвращает ли количество полученной крупы`() {
        val cereal = Cereal.BULGUR
        val received = storage.getCereal(cereal, 4f)
        assertEquals(4f, received, 0.01f)
    }

    @Test
    fun `возвращает ли остаток` () {
        val cereal = Cereal.BULGUR
        val received = storage.addCereal(cereal, 15f)
        assertEquals(10f, received, 0.01f)
    }

    // removeContainer

    @Test
    fun `удален ли контейнер, если он пустой`() {
        val cereal = Cereal.PEAS
        storage.getCereal(cereal, 10f)
       val result = storage.removeContainer(cereal)
        assertTrue(result)
    }

    @Test
    fun `НЕ удален ли контейнер, если он НЕ пустой`() {
        val cereal = Cereal.PEAS
        storage.getCereal(cereal, 9f)
        val result = storage.removeContainer(cereal)
        assertFalse(result)
    }

    // getAmount

    @Test
    fun `cколько крупы в контейнере`() {
        val cereal = Cereal.MILLET
        val inStorage = storage.getAmount(cereal)
        assertEquals(10f, inStorage)
    }
    @Test
    fun `cколько крупы в контейнере после изъятия`() {
        val cereal = Cereal.MILLET
        val inStorage = storage.getAmount(cereal)
        storage.getCereal(cereal,5f)
        assertEquals(5f, inStorage)
    }

    // getSpace
    @Test
    fun `сколько есть места изначально` () {
        val cereal = Cereal.BUCKWHEAT
        val storageAvailable = storage.getSpace(cereal)
        assertEquals(10f, storageAvailable)
    }

    @Test
    fun `сколько есть места после добавления` () {
        val cereal = Cereal.BUCKWHEAT
        storage.addCereal(cereal, 50f)
        val storageAvailable = storage.getSpace(cereal)
        assertEquals(60f, storageAvailable)
    }

    //testToString

    @Test
    fun `правильно ли отображается`() {
        val storage = CerealStorageImpl(10f, 20f)
        val expected = "В вашем контейнере места: 10f, а в хранилище 20f."
        assertEquals(expected, storage.toString())
    }

//    @Test
//    fun getContainerCapacity() {
//    }11

    // getStorageCapacity

    @Test
    fun getStorageCapacity() {
    }
}