import java.util.Scanner;
class Naloga2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Vhod: " + a);
        if(a < 0) {
            a *= -1;
        }
        String stevilo;
        if(a < 10) {
            stevilo = "enomestno";
        } else if(a < 100) {
            stevilo = "dvomestno";
        } else if(a < 1000) {
            stevilo = "tromestno";
        } else if(a < 10000) {
            stevilo = "stirimestno";
        } else if(a < 100000) {
            stevilo = "petmestno";
        } else if(a < 1000000) {
            stevilo = "sestmestno";
        } else {
            stevilo = "vecmestno";
        } 
        System.out.println("Stevilo je " + stevilo + ".");
    }
}
