package ativ2;

import ativ2.fibo;

import java.util.Scanner;

public class atividade2Estagio {
    public static void main(String[] args) {
        //2
        /*
        @autor Andrew de oliveira Figueiredo
        Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência
        de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
         */
        Scanner in = new Scanner(System.in);
        fibo f = new fibo();
        System.out.println("digite o valor que quer pesquisar na sequencia de fibonacci");
        int valor= in.nextInt();
        System.out.println( f.Fib(valor));


        }
}
