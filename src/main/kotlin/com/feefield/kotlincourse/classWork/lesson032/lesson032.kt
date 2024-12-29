package com.feefield.kotlincourse.classWork.lesson032

fun calculateDiscountedPrice(originalPrice: Double, discountPercentage: Int): Double {

    require(originalPrice >= 0) { "Цена должна быть неотрицательной" }
    require(discountPercentage in 0..100) { "Скидка должна быть от 0 до 100%" }

    return originalPrice * (1 - discountPercentage / 100.0)

}
fun textToPhone(phone: String): String {
    return phone
}

