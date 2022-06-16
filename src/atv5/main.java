package atv5;

import java.util.Scanner;

public class main {
    /*
    Escreva um programa que inverta os caracteres de um string.
     */
    public static void main(String[] args) {
        System.out.println("digite a string desejada");
        Scanner in = new Scanner(System.in);
        String palavra = in.nextLine();
        StringBuilder dest = new StringBuilder();
        for (int i = (palavra.length() - 1); i >= 0; i--) {
            dest.append(palavra.charAt(i));
        }
        System.out.println(dest);
    }
}
