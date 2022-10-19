package entrega20222109
fun main() {

    var soma = 0
    for (x in 1..500) {
        if(x % 3 == 0 && x % 2 != 0){
            soma += x
        }
    }
    println(soma)
}