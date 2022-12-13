package gradfiap;

import java.util.Scanner;

public class EX_funcpar {
    public static boolean nota_valida(double nota)
    {
     if (nota >= 0 && nota <= 10)
         return (true);
     else
         return (false);
    }
    public static void main (String[]args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("digite nota 01: ");
        nota1 = entrada.nextDouble();

        if (nota_valida(nota1))
        {
            System.out.print("digite a nota 02 :");
            nota2 = entrada.nextDouble();
            if (nota_valida(nota2))
            {
             media = (nota1 + nota2) / 2;
             System.out.print("A media das notas " + nota1 + " e " + nota2 + " é "+ media);
            }
            else
            {
                System.out.print("A nota 02 "+ nota2+ " é inválida");
            }
        }
        else
        {
            System.out.print("a nota01 " + nota1 + " é inválida");
        }
    }
}
