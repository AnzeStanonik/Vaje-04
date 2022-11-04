import java.util.Scanner;
class Naloga6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String napaka = "vhodni podatek je napacen";
        int a = 0;
        try {
            a = sc.nextInt();
        }
        catch (Exception e) {
            System.out.println(napaka);
            return;
        }
        String cifra;
        switch(a) {
            case 0:
                cifra = "nic";
                break;
            case 1:
                cifra = "ena";
                break;
            case 2:
                cifra = "dva";
                break;
            case 3:
                cifra = "tri";
                break;
            case 4:
                cifra = "stiri";
                break;
            case 5:
                cifra = "pet";
                break;
            case 6:
                cifra = "sest";
                break;
            case 7:
                cifra = "sedem";
                break;
            case 8:
                cifra = "osem";
                break;
            case 9:
                cifra = "devet";
                break;
            default :
                cifra = napaka;
        }
        System.out.println(cifra);
    }
}
