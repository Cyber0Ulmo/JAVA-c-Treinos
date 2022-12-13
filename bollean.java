package ada;

public class bollean {

    public static void main(String[]args){

        boolean fim_de_semana = true;
        boolean fazendo_sol = true;
        boolean vamos_a_praia = fim_de_semana && fazendo_sol;

        System.out.println(vamos_a_praia);

        String mensagem = fim_de_semana ? "é final de semana" : "não é final de semana";
        System.out.println(mensagem);
    }
}
