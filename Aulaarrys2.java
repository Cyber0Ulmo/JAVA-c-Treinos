package ada;

public class Aulaarrys2 {

    public static void main(String[]args){

        int[] listanumeros = {5, 4, 2, 8, 11};
        int maior =listanumeros[0];
        int menor =listanumeros[0];
        int media= 0;

        for (int i=0; i<listanumeros.length; i++) {
            if (listanumeros[i]> maior){
                maior=listanumeros[i];
            }
            if (listanumeros[i]< menor){
                menor =listanumeros[i];
            }
            media += listanumeros[i];
        }

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media/ listanumeros.length);
    }
}
