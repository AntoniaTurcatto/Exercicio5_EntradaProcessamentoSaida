import java.util.Scanner

fun main(args: Array<String>) {
    val entrada= Scanner(System.`in`)
/*
1 - Faça um programa que peça ao usuário para digitar dois números e mostre a soma
desses números.
 */
    println("Digite o 1° numero: ")
    var n1 = entrada.nextInt()
    println("Valor informado: $n1")
    println("Digite o 2° numero: ")
    var n2 = entrada.nextInt()
    println("Valor informado: $n2")
    var soma : Int = n1+n2
    println("Soma: $soma")

}