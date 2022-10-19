package entrega20222109

fun main(){

    println("Digite 15 alturas de pessoas diferentes: ")

    var altura: Double = readLine ()!!.toDouble()


    var maioraltura = 10000000000000000.0
    var menoraltura = 0.0

    for (h in 1..15) {
        val altura

        if (altura == 0.0) {
            maioraltura = altura
            menoraltura = altura
        }
        else if (altura > maioraltura) {
            maioraltura = altura
        }
        else if (altura < menoraltura) {
            menoraltura = altura
        }
    }
    println("A maior altura é: $maioraltura")
    println("A menor altura é: $menoraltura")
}

