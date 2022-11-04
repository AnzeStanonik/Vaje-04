import java.util.Scanner;
class Naloga9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ocena1 = sc.nextInt();
        int ocena2 = sc.nextInt();
        int ocena3 = sc.nextInt();
        float skupek = ocena1 + ocena2 + ocena3;
        float povprecje = skupek / 3;
        System.out.println("Skupna ocena za racunalnistvo: " + ocena1);
        System.out.println("Skupna ocena za laboratorijske vaje iz racunalnistva: " + ocena2);
        System.out.println("Skupna ocena za matematiko: " + ocena3);
        System.out.println("");
        System.out.print("Povprecje ocen: " + povprecje);
        if(povprecje == 5) {
            System.out.print(" Odlicno!");
        } else if(povprecje >= 4) {
            System.out.print(" Prav dobro!");
        } else if(povprecje == 1) {
            System.out.print(" Izboljsaj ocene!");
        } else {
            System.out.print(" Dobro?");
        }
    }
}