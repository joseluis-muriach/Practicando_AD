package Unit2

import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader

fun main(args: Array<String>){
    //Esto me permite leer todos los caracteres sin inportar si es simbolo o lo que sea
    val fileA = FileInputStream("D:\\proyectos_de_intellij\\Practicando_AD\\src\\Unit2\\f1.txt")
    var c = fileA.read()
    while (c!=-1){
        print(c.toChar())
        c = fileA.read()
    }
    fileA.close()
    println()
////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Al contrario que esto
    val fileB = File("D:\\\\proyectos_de_intellij\\\\Practicando_AD\\\\src\\\\Unit2\\\\f1.txt")
    //Lo leo directamente
    var writeFile = BufferedReader(InputStreamReader(fileB.inputStream()))
    var newFile = writeFile.readLine()

    println(newFile)
////////////////////////////////////////////////////////////////////////////////////////////////////////////

    val fileC = FileInputStream("D:\\proyectos_de_intellij\\Practicando_AD\\src\\Unit2\\f1.txt")
    var d = fileC.read()
    while (d!=-1){
        print(d.toChar())
        d = fileC.read()
    }
    fileA.close()
    println()
}