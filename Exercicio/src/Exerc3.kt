fun main() {

    print("Digite a altura: ")
    var altura = readLine()!!.toDouble()
    var pesoHomem = (72.7 * altura) - 58
    var pesoMulher = (62.1 * altura) - 44.7


    println("Para homens: $pesoHomem")
    print("Para mulheres: $pesoMulher")
}