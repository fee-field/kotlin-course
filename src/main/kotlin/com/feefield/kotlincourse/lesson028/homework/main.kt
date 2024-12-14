package com.feefield.kotlincourse.lesson028.homework

import java.io.File

fun main() {

//Создайте текстовый файл workspace/task1/example.txt
//запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.

    val fileOne = File("workspace/task1/example.txt")
    fileOne.parentFile.mkdirs()
    fileOne.writeText("Hello, Kotlin!")

    if (fileOne.exists()) {
        println("Файл существует")
    } else {
        println("Файл не найден")
    }

//Создайте директорию workspace/task2/testDir
//проверьте, является ли она директорией, и выведите её абсолютный путь.
    val dirTwo = File("workspace/task2/testDir")
    dirTwo.parentFile.mkdirs()
    dirTwo.mkdirs()

    if (dirTwo.isDirectory) {
        println("That's a directory and the path is ${dirTwo.absolutePath}")
    } else {
        println("Not a directory")
    }

//Создайте директорию workspace/task3/structure.
//Внутри директории structure создайте папку myDir с двумя вложенными
// поддиректориями subDir1 и subDir2.
// Проверьте, что myDir действительно содержит эти поддиректории.
    val dirThree = File("workspace/task3/structure")
    dirThree.mkdirs()

    val myDir = File(dirThree, "myDir")
    myDir.mkdirs()
    val subDirTwo1 = File(myDir, "subDir1")
    subDirTwo1.mkdirs()
    val subDirTwo2 = File(myDir, "subDir2")
    subDirTwo2.mkdirs()

//    if (subDirTwo1.exists() && subDirTwo2.exists()) {
//        println("Directories are in place")
//    } else {
//        println("No such directories created")
//    }

    val files = myDir.listFiles()
    files?.forEach { file ->
        if (file.isDirectory) {
            println(file.name)
        }
    }

//Задача 4
//Создайте директорию workspace/task4/temp.
//Внутри директории temp создайте несколько вложенных файлов и директорий.
// Удалите директорию workspace/task4 со всем содержимым

//    val tempDir = File("workspace/task4/temp")
//    tempDir.mkdirs()
//    val tempDir1 = File(tempDir, "myDir")
//    tempDir1.mkdirs()
//    val tempFile = File(tempDir1, "workspace/task4/temp/Text.txt")
//    tempFile.createNewFile()
//
//        if (tempDir.deleteRecursively()) {
//        println("Директория и всё её содержимое удалено")
//    } else {
//        println("Не удалось удалить директорию")
//    }

//Задача 5
//Создайте файл workspace/task5/config/config.txt
//запишите в него список параметров (в формате ключ=значение), а
// затем прочитайте файл и выведите только значения.

    val fileFive = File("workspace/task5/config/config.txt")
    fileFive.parentFile.mkdirs()
    fileFive.createNewFile()

    val params = listOf("par1=value1", "par2=value2", "par3=value3")
    fileFive.writeText(params.joinToString(("\n")))
    println(fileFive.readLines().map {
        it.split("=")[1]
    })

//Задача 6
//Пройди по всем вложенным директориям workspace и выведи в консоль
// сначала пути директорий, а потом пути файлов

    val workspace = File("workspace")
    workspace.walk().filter { it.isDirectory }.forEach { println(it.absolutePath) }
    workspace.walk().filter { it.isFile }.forEach { println(it.absolutePath) }

//Задача 7
//Создайте директорию workspace/task9/docs.
//Проверь, есть ли файл с именем readme.md. Если файла нет, создайте его
// и запишите текст "This is a README file."

    val dirSeven = File("workspace/task9/docs")
    dirSeven.mkdirs()
    val fileSeven = File(dirSeven, "readme.md")
    if (fileSeven.exists()) {
        println("file exists")
    } else {
        fileSeven.createNewFile()
        fileSeven.parentFile.mkdirs()
        fileSeven.writeText("This is a README file.")
    }

//Задача 8
//Создайте файлы
//workspace/task10/data/1/4/prod/data14.mysql
//workspace/task10/data/2/3/prod/data23.mysql
//workspace/task10/data/5/2/prod/data52.mysql
//Создайте директорию workspace/task10/backup и скопируйте туда файлы
// из workspace/task10/data сохраняя структуру директорий.
// Для копирования используй метод copyTo

    val filesEight = listOf(
        "workspace/task10/data/1/4/prod/data14.mysql",
        "workspace/task10/data/2/3/prod/data23.mysql",
        "workspace/task10/data/5/2/prod/data52.mysql"
    )
//    val file1 = File("workspace/task10/data/1/4/prod/data14.mysql")
//    file1.parentFile.mkdirs()
//    file1.createNewFile()

    filesEight.forEach { it ->
        File(it).apply {
            parentFile.mkdirs()
            createNewFile()
        }
    }

    val backupDir = File("workspace/task10/backup").mkdirs()
    val sourceDir = File("workspace/task10/data")

//    sourceDir.walk().filter {it.isFile}.forEach { it1 -> it1.copyTo(backupDir, true)}

}