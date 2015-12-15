package main;


public class Main {

    //private Algorithm alg;

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createDes();
            }
        });

    }
    private static void createDes() {
        Algorithm alg = new Algorithm();
        String wynik;
        String wiadomosc="message123";
        String klucz="8bytekey";
        alg.AddKey(klucz);
        alg.AddMsg(wiadomosc);
        //alg.Run("szyfruj");
        System.out.println("Szyfruj");
        System.out.println("klucz: "+klucz+" wiadomosc: "+wiadomosc);
        wynik=alg.RunDes("szyfruj");

        System.out.println("wynik:"+ wynik);

        System.out.println("odszyfruj: " + wynik);
        alg.AddMsg(wynik);
        wynik=alg.Run("rozszyfruj");
        System.out.println("wynik:"+ wynik);
        //System.out.println("wynik");
        //alg.AddMsg(wynik);


    }
}
