fun main() {

    print("Digite o peso dos peixes: ")
    var peso = readLine()!!.toDouble()

    var multa = 4
    var limitePeso = 50
    var pesoExcedido = peso - limitePeso

    if (pesoExcedido > 0){
        println("Excedeu $pesoExcedido")
        var valorTotal = pesoExcedido * multa
        print("O Valor a ser pago é de R\$ $valorTotal")
    }


}