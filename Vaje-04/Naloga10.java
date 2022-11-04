import java.util.Scanner;
class Naloga10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cenaN = sc.nextInt();
        int cenaT = sc.nextInt();
        int razlika = cenaT - cenaN;
        float sprememba = razlika * 100 / cenaN;
        System.out.println("Nakupna cena: " + cenaN);
        System.out.println("Trenutna cena: " + cenaT);
        System.out.println("Razlika: " + razlika);
        System.out.println("Sprememba: " + sprememba + "%");
    }
}
