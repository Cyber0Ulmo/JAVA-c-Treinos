package gradfiap;

import java.util.Scanner;

public class operacao {

    public static void main(String[]args) {

        Scanner entrada = new Scanner(System.in);

        int num, dobro;

        System.out.print("digite um número: ");
        num = entrada.nextInt();
        dobro = num * num * num;
        System.out.print("o resultado é: " + dobro);

    }
}