import java.util.Scanner;
class Naloga3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        String c;
        String d;
        String e;
        if(a < b) {
            c = " <- Manjse";
            d = " <- Vecje";
            e = "se razlikujeta.";
        } else if(a > b){
            c = " <- Vecje";
            d = " <- Manjse";
            e = "se razlikujeta.";
        } else {
            c = "";
            d = "";
            e = "sta enaki.";
        }
        System.out.println("a=" + a + c);
        System.out.println("b=" + b + d);
        System.out.println("-------");
        System.out.println("Stevili " + e);
    }
}
