import java.util.Scanner;
public class HipotenusBulma {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    double c;
    System.out.print("1.KENARI GİRİNİZ:");
        int a = scan.nextInt();
        System.out.print("2.KENARI GİRİNİZ:");
        int b = scan.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs "+" "+c);
        int d = a*b;
        System.out.println("Üçgenin alanı"+" "+d);
    }
}
