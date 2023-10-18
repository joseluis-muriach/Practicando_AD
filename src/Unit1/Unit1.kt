package Unit1

import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader

fun main(args: Array<String>) {
    //Unit1.main1()
    //Unit1.main2()
    //Unit1.main3()
    //Unit1.main4()
    examen()
}

fun main1() {
        //Para listar los directorios
    val file = File(".")
    for (e in file.list()!!) {
        println(e)
    }
}

fun main2() {
    //Ahora quiero ver el contenido de un directorio
    val directorio = File("D:\\proyectos_de_intellij\\Practicando_AD\\src\\texto")
    //Abrimos el flujo de entrada
    val fileInputStream = FileInputStream(directorio)

    //Convierte los bytes en caracteres legibles
    val inputStreamReader = InputStreamReader(fileInputStream)
    //Lee la variable de arriba
    val bufferedReader = BufferedReader(inputStreamReader)

    //Pasa lo que ha leido el buffered a una variable
    var direc = bufferedReader.readLine()

    println("La línea leída desde el archivo es: $direc")

    bufferedReader.close()
}

fun main3(){
    var file = File("D:\\proyectos_de_intellij\\Practicando_AD\\src\\texto")

    //Nos dice el nombre del dichero
    println("Name of the file is: " + file.name)
}

fun main4(){
    var file = File("D:\\proyectos_de_intellij\\Practicando_AD\\src\\texto")

    if (file.exists()) {
        if (file.isDirectory) {
            println(file.name + " is directory")
        } else {
            println(file.name + " is file")
        }
    }
}
//////////////////////////////////////////////////////////////////////////////////////////
fun examen() {
    var file = File("D:\\proyectos_de_intellij\\Practicando_AD\\src\\texto")

    var f = BufferedReader(InputStreamReader(file.inputStream()))

    var writeFile = f.readLine()

    println(writeFile)
    f.close()
}
//////////////////////////////////////////////////////////////////////////////////////////


