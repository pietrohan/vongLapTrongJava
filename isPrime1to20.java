import java.util.Scanner;

public class isPrime1to20 {
    public static void main(String[] args) {
        System.out.println("Mời bạn nhập số lượng số nguyên tố cần in ra: ");
        Scanner sc = new Scanner(System.in);
        // nhập number là số lượng số nguyên tố
        int number = sc.nextInt();
        // cout là số lượng số nguyên tố cần in ra bằng number chưa
        int cout = 0;
        int n = 2;
        while (number < 1) {
            System.out.println("mời bạn nhập lại.");
            number = sc.nextInt();
        }
        for (; cout <= number;) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n);
                cout++;
            }
            n++;
        }
    }
}