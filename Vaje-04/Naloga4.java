import java.util.Scanner;
class Naloga4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String sodostLihost;
        String pozitivnostNegativnost;
        if(a % 2 == 0) {
            sodostLihost = "sodo";
        } else {
            sodostLihost = "liho";
        }
        if(a > 0) {
            pozitivnostNegativnost = "pozitivno";
        } else if (a < 0) {
            pozitivnostNegativnost = "negativno";
        } else {
            pozitivnostNegativnost = "ni niti pozitivno, niti negativno";
        } 
        System.out.println("Stevilo " + a + " je " + sodostLihost + " in " + pozitivnostNegativnost + ".");
    }
}
