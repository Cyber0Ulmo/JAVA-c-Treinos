package gradfiap;

import java.util.Scanner;

public class tiposprts {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        float n1, n2, n3, n4, media;

        System.out.println("digite 4 numeros");

        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        n3 = entrada.nextFloat();
        n4 = entrada.nextFloat();

        media = (n1 + n2 +n3 +n4) / 4;

        System.out.println("média = " + media);


    }
}
