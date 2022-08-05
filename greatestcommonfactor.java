import java.util.Scanner;

public class greatestcommonfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println(" nhập a: ");
        a = sc.nextInt();
        System.out.println(" nhập b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("No greatest common factor ");
        } else if (a == 0 || b == 0) {
            System.out.println("Greatest common factor: " + (a > b ? a : b));
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }

            System.out.println("Greatest common factor: " + a);
        }
    }
}