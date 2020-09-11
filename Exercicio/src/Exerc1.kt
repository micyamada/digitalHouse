fun main() {
    print("Digite a nota 1: ")
    var nota1 = readLine()!!.toInt()
    print("Digite a nota 2: ")
    var nota2 = readLine()!!.toInt()
    print("Digite a nota 3: ")
    var nota3 = readLine()!!.toInt()
    print("Digite a nota 4: ")
    var nota4 = readLine()!!.toInt()

    var media = (nota1+nota2+nota3+nota4)/4

    print("A média é $media")
}