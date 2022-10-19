package entrega20222109


fun main() {

    println("Informe um número inteiro positivo: ")
    val nunInt: Int = readLine()!!.toInt()

    var num = 1
    var mP = 0.0
    val mG: Double
    var cP = 0.0
    var cI = 0.0
    var sP = 0.0
    var sI = 0.0

    while (num != (0)) {
        num = nunInt

        if (num > 0 && num %2 == 0) {
            cP += 1
            sP += num
            mP = (sP / cP)
        }
        if (num > 0 && num %2 != 0) {
            cI += 1
            sI += num

        }

    }
    mG = ((sP+sI)/(cP+cI))
    println()
    println("Quantidade de números pares: $cP")
    println("Quantidade de números ímpares: $cI")
    print("Média dos valores pares: ")
    println("$mP %")
    println("Média geral dos valores: ")
    println(" $mG % ")

}