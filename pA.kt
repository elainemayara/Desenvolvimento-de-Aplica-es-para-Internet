package entrega20222109

fun main() {

    print("Qual o primeiro termo da PA? ")
    var a = readLine()!!.toInt()
    print("Digite a razão da PA: ")
    val razao = readLine()!!.toInt()

    for (num in 1..10) {
        a += razao

        println(a)
    }

}