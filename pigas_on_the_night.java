package gradfiap;

import java.util.Scanner;

public class pigas_on_the_night {

    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        float preco_maco, qtd_maco, anos, dias_fumante, custo;

        System.out.println("digite o preço do maço: ");
        preco_maco = entrada.nextFloat();
        System.out.println("digite a quantidade de maços: ");
        qtd_maco = entrada.nextFloat();
        System.out.println("digite a quantia de anos que vc fuma caipora: ");
        anos = entrada.nextFloat();

        dias_fumante = anos * 365;
        custo = dias_fumante * preco_maco;
        System.out.println("voce ja gastou R$" + custo + "fumando");

    }
}
