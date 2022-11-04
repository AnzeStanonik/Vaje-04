import java.util.Scanner;
class Naloga1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Vhod: " + a);
        if(a < 0) {
            a *= -1;
        }
        if(a < 10) {
            System.out.println("Stevilo je enomestno.");
        }else {
            System.out.println("Stevilo je vecmestno.");
        }
     }
 }