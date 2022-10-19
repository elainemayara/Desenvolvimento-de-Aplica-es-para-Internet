package entrega20222109

fun main() {

    println("Informe um número inteiro positivo ou negativo: ")
    var valor = 0.0
    var qtdValoresPosit = 0.0
    var qtdValoresNegat = 0.0
    var somaP = 0.0
    var somaN = 0.0
    var mediaAritmP = 0.0
    var mediaAritmN = 0.0

    
    while (valor != (-1.0)) {

        if (valor > 0) {
            qtdValoresPosit += 1
            somaP += valor
            mediaAritmP = somaP/qtdValoresPosit


        }
        else if (valor < 0) {
            qtdValoresNegat += 1
            somaN += valor
            mediaAritmN = somaN/qtdValoresNegat

        } else {
            println("Valor incorreto!")
        }


    }
    val percentPosit: Double = (qtdValoresPosit/(qtdValoresPosit + qtdValoresNegat))*100
    val percentNegat: Double = (qtdValoresNegat/(qtdValoresPosit + qtdValoresNegat))*100
    println()
    println("Quantidade de valores positivos: $qtdValoresPosit")
    println("Quantidade de valores negativos: $qtdValoresNegat")
    println("O valor total dos números positivos é: $somaP")
    println("O valor total dos números negativos é: $somaN")
    println("A média dos números positivos é: $mediaAritmP")
    println("A média dos números negativos é: $mediaAritmN")
    print("Percentual referente às entradas positivas: ")
    println(" $percentPosit %" )
    print("Percentual referente às entradas negativas: ")
    println("$percentNegat %" )

}