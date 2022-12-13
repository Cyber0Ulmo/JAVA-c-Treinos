package gradfiap;

import java.util.Scanner;

public class EX1funcnp {
    public static double pi()
    {
        return 3.14159;
    }
    public static void main (String[]args){
        double raio, op;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o valor do raio: ");
        raio = entrada.nextDouble();
        op = pi() * (raio * raio);
        System.out.print(op);
    }
}
