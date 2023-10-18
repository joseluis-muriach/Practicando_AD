package Unit2

import java.io.*

fun main(args: Array<String>){
//    //Esto me permite leer mas caracteres que lo que hemos visto en el tema 1
//    val fileA = FileInputStream("D:\\proyectos_de_intellij\\Practicando_AD\\src\\Unit2\\f1.txt")
//    var c = fileA.read()
//    while (c!=-1){
//        print(c.toChar())
//        c = fileA.read()
//    }
//    fileA.close()
//    println()
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//
//    //Al contrario que esto (TEMA 1)
//    val fileB = File("D:\\\\proyectos_de_intellij\\\\Practicando_AD\\\\src\\\\Unit2\\\\f1.txt")
//    //Lo leo directamente
//    var writeFile = BufferedReader(InputStreamReader(fileB.inputStream()))
//    var newFile = writeFile.readLine()
//
//    println(newFile)
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//
//    //En este pongo otro ejemplo, es del tema 2
//    val fileC = FileInputStream("D:\\proyectos_de_intellij\\Practicando_AD\\src\\Unit2\\f2.txt")
//    var d = fileC.read()
//    while (d!=-1){
//        print(d.toChar())
//        d = fileC.read()
//    }
//    fileA.close()
//    println()
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//
//    val text = "Este archivo ha sido creado y hemos escrito en el"
//    //Creamos el archivo donde vamos a poner el texto
//    val newFileB = FileOutputStream("NewFile.txt") //Si pusiera ,true lo que hariamos seria ir guardando
//
//    //Rcorremos el texto y lo vamos escribiendo en el fichero que hemos creado
//    for (c in text){
//        newFileB.write(c.code)
//    }
//    newFileB.close()
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//
//    //Aquí es donde copiamos lo que hay en un fichero a otro
//var inputFile = FileInputStream("NewFile.txt")
//var outputFile = FileOutputStream("NewFileB.txt")
//
//    var arrayBuffer = byteArrayOf(30)
//    var num = inputFile.read(arrayBuffer)
//
//    while (num != -1) {
//        //Para escribir en el numevo archivo
//        outputFile.write(arrayBuffer, 0, num)
//        //Para saber cuantos datos ha leido
//        num = inputFile.read(arrayBuffer)
//    }
//    inputFile.close()
//    outputFile.close()
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/******************************************************************************************************************/
//
//    //Leer todos los carecteres especiales
//    val text = "Contingut per al fitxer. Ara ja sense por a caràcters especials: ç, à, ú, ..."
//    val fileOut = FileWriter("NewFileC.txt")
//
//    for (e in text) {
//        fileOut.write(e.code)
//    }
//    fileOut.close()
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/******************************************************************************************************************/
    //Copiar lo que haya en un fichero .txt a otro

    //Archivo que vamos a copiar
    val inputF = BufferedReader(FileReader("NewFileC.txt"))
    //Donde lo vamos a copiar
    val outputF = PrintWriter(FileWriter("NewFileD.txt"))

    var write = inputF.readLine()

    while (write != null) {
        outputF.println(write)
        write = inputF.readLine()
    }
    inputF.close()
    outputF.close()
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Transformas de un fichero a otro
    val f_ent = InputStreamReader(FileInputStream("f5.txt"), "UTF-8")
    val f_eix = OutputStreamWriter(FileOutputStream("f5_ISO.txt"), "ISO-8859-1")

    var car = f_ent.read()
    while (car != -1) {
        f_eix.write(car)
        car = f_ent.read()
    }
    f_eix.close()
    f_ent.close()
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/******************************************************************************************************************/
}
