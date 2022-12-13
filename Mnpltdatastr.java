package ada;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Mnpltdatastr {

    public static void main(String[]args) {

        String myName = "Sr. Bui Azul";

        LocalDate today = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
       // System.out.println(today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String dayOfWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime now = LocalDateTime.now();
        if (now.getHour() >= 0 && now.getHour() < 12) {
            saudacao = "Buenos dias, OHAYO";
        } else if (now.getHour() >= 12 && now.getHour() < 18) {
            saudacao = "Boa tarde, KONICHUA";
        } else if (now.getHour() >= 1 && now.getHour() < 24) {
            saudacao = "Boa noite, KONBANWA";
        } else {
            saudacao = "olá.";
        }
        System.out.printf("olá, %s. hoje é %s, %s.%n", myName, dayOfWeek, saudacao.toUpperCase());
    }
}
