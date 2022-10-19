package entrega20222109


fun main() {

    println("Informe um número inteiro positivo: ")
    val nunInt: Int = readLine()!!.toInt()


    var num = 0
    var c1 = 0
    var c2 = 0
    var c3 = 0
    var c4 = 0


    while (num != (-1)) {
        num = nunInt


        if (num in 0..25) {
            c1++
        }
        if (num in 26..50) {
            c2++
        }
        if (num in 51..75) {
            c3++
        }
        if (num in 76..100) {
            c4++
        }
    }
    println("No intervalo [0-25] tem $c1 números")
    println("No intervalo [26-50] tem $c2 números")
    println("No intervalo [51-75] tem $c3 números")
    println("No intervalo [76-100] tem $c4 números")
}