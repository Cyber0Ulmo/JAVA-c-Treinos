package gradfiap;

public class EX1_procdpar {
    public static void saudacao(String usuario, int hora)
    {
        String msg;
        if (hora <= 12){
            msg = "MUUUUSHUUU ja despertas ?";
        } else if (hora <= 18) {
            msg = " Ae dorme hein doidão? thousand tapes happening";
        } else {
            msg = "a noite é longa e cheia de perigos";
        }
        System.out.println("HEY HEY "+ usuario +","+ msg+" AUTA I LOME" );

    }
    public static void main(String[]ars){

        saudacao("Bui",12);
    }
}


