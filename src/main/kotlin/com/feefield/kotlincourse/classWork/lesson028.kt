package com.feefield.kotlincourse.classWork

import java.io.File

fun main() {

//    val file = File("path/to/your/file.txt")
//    val directory = File("path/to/your/directory")
//    file.parentFile.mkdirs()
//    if (file.exists()) {
//        println("Файл существует")
//    } else {
//        println("Файл не найден")
//    }
//    val isNewFileCreated: Boolean = file.createNewFile()
//    if (isNewFileCreated) {
//        println("Файл был создан")
//    } else {
//        println("Файл уже существует")
//    }
//    file.writeText("Hello, world!")
//    val text = file.readText()
//    println(text)
//
//    val files = directory.listFiles()
//    files?.forEach { file ->
//        if (file.isFile) {
//            println(file.name)
//        }
//    }
////    if (file.delete()) {
////        println("Файл удален")
////    } else {
////        println("Не удалось удалить файл")
////    }
////
//    if (file.deleteRecursively()) {
//        println("Директория и всё её содержимое удалено")
//    } else {
//        println("Не удалось удалить директорию")
//    }
//    (1..5).forEach {
//        file.parentFile.resolve("$it").mkdirs()
//    }
//
//    file.walk().filter { it.isFile }
//        .associate { it.name to it.readLines() }
//        .filterValues { data ->
//            data.any {it.contains("text")}
//        }
//
//    println(file.absoluteFile)
//
//    val baseDir = File("path/to")
//    val file1 = File("path/to/nested/file.txt")
//    val relative = file1.toRelativeString(baseDir)
//    println(file1.toRelativeString(baseDir))
//    val baseDir2 = File("path2/to")
//    val file3 = baseDir2.resolve(relative)
//    file3.parentFile.mkdirs()
//    file3.createNewFile()

    val mapOne = mapOf("string01" to 0.2, "string02" to 3.3, "string03" to 7.23)
    writeDataToFile(mapOne, "path/folder/folder02/File.txt")

    println(readFileToMap("path/folder/folder02/File.txt"))
}

fun createFileOrDirectory(path: String) {
    File(path).apply {
        if (path.endsWith("/")) {
            mkdirs()
        } else {
            parentFile.mkdirs()
            createNewFile()
        }
    }
}

fun writeDataToFile(map: Map<String, Double>, path1: String) {
    val dataToString = map.map { "${it.key}=${it.value}" }.joinToString("\n")
    createFileOrDirectory(path1)
    File(path1).writeText(dataToString)
}

fun readFileToMap(path2: String): Map<String, Double> {
    val file02 = File(path2).readLines()
    return file02.associate {
        val string1 = it.split("=")
        string1[0] to string1[1].toDouble()
    }
}