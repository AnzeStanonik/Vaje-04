import java.util.Scanner;
class Naloga5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("");

        
        /*
        System.out.println("Razvrstitev po velikosti:"); 
        System.out.println("a=" + a + "\nb=" + b + "\nc=" + c +
        "\n\nRazvrstitev po velikosti:");

        float x[] = {0, 0, 0};
        boolean a_vec_kot_b = false;
        x[0] = a;
        x[1] = b;
        x[2] = c;
        int y[] = {0, 0, 0};
        for(int i = 0; i < x.length; i++) {
            System.out.println(i + 1 + ". x[" + i + "] = " + x[i]);
        }
        if (a > b)
            a_vec_kot_b = true;
        else if (!(a > b))
            a_vec_kot_b = false;

        if (a_vec_kot_b == true)
            System.out.println("a je več kot b");
         */


        if(a <= b && b <= c) {
            System.out.println("1. " + c + " (c)");
            System.out.println("2. " + b + " (b)");
            System.out.println("3. " + a + " (a)");
            System.out.println("");
            System.out.println("Najvecje izmed vnesenih stevil je bilo  c=" + c + ".");
        } else if(a >= b && a <= c ) {
            System.out.println("1. " + c + " (c)");
            System.out.println("2. " + a + " (a)");
            System.out.println("3. " + b + " (b)");
            System.out.println("");
            System.out.println("Najvecje izmed vnesenih stevil je bilo  c=" + c + ".");
        } else if(a <= c && b >= c) {
            System.out.println("1. " + b + " (b)");
            System.out.println("2. " + c + " (c)");
            System.out.println("3. " + a + " (a)");
            System.out.println("");
            System.out.println("Najvecje izmed vnesenih stevil je bilo  b=" + b + ".");
        } else if(a >= c && b >= a) {
            System.out.println("1. " + b + " (b)");
            System.out.println("2. " + a + " (a)");
            System.out.println("3. " + c + " (c)");
            System.out.println("");
            System.out.println("Najvecje izmed vnesenih stevil je bilo  b=" + b + ".");
        } else if(b >= c && b <= a) {
            System.out.println("1. " + a + " (a)");
            System.out.println("2. " + b + " (b)");
            System.out.println("3. " + c + " (c)");
            System.out.println("");
            System.out.println("Najvecje izmed vnesenih stevil je bilo  a=" + a + ".");
        } else if(b <= c && c <= a) {
            System.out.println("1. " + a + " (a)");
            System.out.println("2. " + c + " (c)");
            System.out.println("3. " + b + " (b)");
            System.out.println("");
            System.out.println("Najvecje izmed vnesenih stevil je bilo  a=" + a + ".");
        } 
    }
}
