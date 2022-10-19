package entrega20222109

fun main(){


    println("Digite um número inteiro: ")
    val numFat: Int = readLine()!!.toInt()
    var fat = 1

    for (num in 1..numFat) {

        fat *= num


        println(num)
    }

    println(fat)
}
