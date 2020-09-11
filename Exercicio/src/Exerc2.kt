fun main() {
    print("Quanto vale sua hora? ")
    var valor = readLine()!!.toDouble()
    print("Quantas horas você trabalhou? ")
    var horas = readLine()!!.toInt()


    var salario = (valor*horas)

    print("A média é $salario")
}