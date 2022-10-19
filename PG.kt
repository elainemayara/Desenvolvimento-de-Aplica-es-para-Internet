package entrega20222109


    fun main(){

        print("Qual o primeiro valor da PG? ")
        var pa: Int = readLine()!!.toInt()

        print("Digite a razão da PG: ")
        val razao: Int = readLine()!!.toInt()

        for (num in 1..10) {
            pa *= razao

            println(pa)
        }
    }