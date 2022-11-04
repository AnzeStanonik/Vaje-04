import java.util.Scanner;
class Naloga7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paket = sc.next();
        int sekunde = sc.nextInt();
        double cenaSekund;
       /* if(sekunde < 0) {
            System.out.println("Napacen vnos podatkov.");
            return;
        }*/
        if(sekunde <= 500) {
            cenaSekund = sekunde * 0.01;
        } else if(sekunde <= 800) {
            cenaSekund = (sekunde - 500) * 0.008 + 5;
        } else {
            cenaSekund = (sekunde - 800) * 0.005 + 7.4;
        }
        int cenaPaketa;
        String a = "Mini";
        String b = "Midi";
        String c = "Maxi";
        if(paket == a) {
            cenaPaketa = 10;
        } else if(paket == b) {
            cenaPaketa = 20;
        } else if(paket == c) {
            cenaPaketa = 30;
        } else {
            cenaPaketa = 0;
            /*System.out.println("Napacen vnos podatkov.");
            return;*/
        }
        double koncnaCena = cenaPaketa + cenaSekund;
        System.out.println("Vas paket: " + paket + " (" + cenaPaketa + " enot)");
        System.out.println("Opravljenih sekund klicev: " + sekunde );
        System.out.println("------------------");
        System.out.println("Koncna cena: " + cenaPaketa + " + " + cenaSekund + " = " + koncnaCena + " enot");
    }
}
