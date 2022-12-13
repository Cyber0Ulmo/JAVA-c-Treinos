package gradfiap;

import java.util.Scanner;

public class saque {
    public static void main(String[]args) {

        Scanner entrada = new Scanner(System.in);

        int quantia, ced50, ced20, ced10, ced05;

        System.out.println("digite a quantia: ");
        quantia = entrada.nextInt();

        ced50 = quantia / 50;
        quantia = quantia % 50;
        ced20 = quantia / 20;
        quantia = quantia % 20;
        ced10 = quantia / 10;
        quantia = quantia % 10;
        ced05 = quantia / 5;
        quantia = quantia % 5;

        System.out.println("A quantidade de cédulas de 50 é " + ced50);
        System.out.println("A quantidade de cédulas de 20 é " + ced20);
        System.out.println("A quantidade de cédulas de 10 é " + ced10);
        System.out.println("A quantidade de cédulas de 05 é " + ced05);

    }
}
