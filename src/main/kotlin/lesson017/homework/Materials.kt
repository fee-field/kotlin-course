package lesson017.homework

   abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

//Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)

class BottomContainer(
    ) : Materials() {
    fun addToBottom(material: String) {
        val copiedMaterials = extractMaterial().toMutableList()
        copiedMaterials.add(0, material)
        copiedMaterials.forEach {addMaterial(it)}
    }
}

// Третий класс должен добавлять элементы в список в алфавитном порядке. Если мы добавляем новый
// элемент в список, то он должен встать где-то между другими элементами и занять место в
// соответствии с сортировкой по алфавиту.

class SortedAlphabetically(
) : Materials() {
    fun addAlphabetically(material: String) {
        val copiedMaterials = extractMaterial().toMutableList()
        val index = copiedMaterials.indexOfFirst { it > material }
        if (index >= 0) {
            copiedMaterials.add(index, material)
        } else {
            copiedMaterials.add(material)
        }
        copiedMaterials.forEach { addMaterial(it) }
    }
}

//Четвёртый класс должен принимать словарь из строк (ключи и значения). Каждая пара ключа и
// значения должна попадать в контейнер следующим образом - ключ в начало, значение в конец.

class MapKeyValue(
    ):  Materials() {
        fun map(pairs: Map<String, String>) {
        val copiedMaterials = extractMaterial().toMutableList()
        pairs.forEach { (key, value) ->
            copiedMaterials.add(0, key)
            copiedMaterials.add(value)
        }

            copiedMaterials.forEach { addMaterial(it) }
    }
}

//Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно с теми данными, которые уже есть. То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.

class EveryOther(
):  Materials() {
    fun everyOther() {
        val copiedMaterials = extractMaterial().toMutableList()

    }
}