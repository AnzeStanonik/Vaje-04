import java.util.Scanner;
class Naloga11 {
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
        System.out.println("");
        if(sprememba > 100) {
            System.out.println("Stanje: Cestitamo, vase spektakularne sposobnosti so neprecenjive!");
        } else if(sprememba > 5) {
            System.out.println("Stanje: Odlicen nakup, uspesno ste povecali svoje premozenje!");
        } else if(sprememba > -5) {
            System.out.println("Stanje: Investicija caka na bolse case.");
        } else if(sprememba > -50) {
            System.out.println("Stanje: Trend kot kaze ni obetaven.");
        } else if(sprememba > -75) {
            System.out.println("Stanje: Cas za dodatne nakupe?");
        } else {
            System.out.println("Vec srece prihodnjic.HODL.");
        }
    }
}
