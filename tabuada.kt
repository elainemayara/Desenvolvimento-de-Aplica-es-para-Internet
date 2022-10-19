package entrega20222109


fun main(){
    val num =0
    println("Digite o Primeiro número inteiro para formar a tabuada: ")
    val nunInt1: Int = readLine()!!.toInt()

    println("Digite o Segundo número inteiro para formar a tabuada: ")
    val nunInt2: Int = readLine()!!.toInt()

    var resultado: Int

    for (num in 0..10) {

        resultado = nunInt1 * nunInt2
        println("$nunInt1   x   $nunInt2  =  $resultado")
    }

}