import java.util.Scanner

fun main(args: Array<String>) {
    val entrada= Scanner(System.`in`)
/*
1 - Faça um programa que peça ao usuário para digitar dois números e mostre a soma
desses números.
 */
    println("Digite o 1° numero: ")
    var n1 = entrada.nextInt()
    //println("Valor informado: $n1")
    println("Digite o 2° numero: ")
    var n2 = entrada.nextInt()
    //println("Valor informado: $n2")
    var soma : Int = n1+n2
    println("Soma: $soma")

/*
2 - Faça um programa que calcule o quadrado de
um número informado pelo usuário.
 */
    println("Informe um numero: ")
    var numQuadrado : Float = entrada.nextFloat()
    numQuadrado *= numQuadrado
    entrada.nextLine()
    println("O quadrado do numero informado é $numQuadrado")

/*
3 - Faça um programa que peça ao usuário para informar seu nome e sua idade, e que
exiba uma mensagem de boas-vindas com o nome e a idade informados.
 */

    println("Informe o seu nome: ")
    var nome : String = entrada.nextLine()
    println("Sua idade: ")
    var idade : Int = entrada.nextInt()
    println("Bem vinde!\n$nome, $idade anos.")
}