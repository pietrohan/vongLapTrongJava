import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate =0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số tiền bạn muốn gửi: ");
        money = sc.nextDouble();
        System.out.println("nhập số tháng bạn muốn gửi: ");
        month = sc.nextInt();
        while (month != 3 && month != 9 && month != 12 && month != 18 && month != 24 && month != 36) {
            System.out.println("mời bạn nhập lại");
            month = sc.nextInt();
        }
        if (month == 3) {
            interestRate = 3.6 / 12;
        } else if (month == 9) {
            interestRate = 5.3 / 12;
        } else if (month == 12) {
            interestRate = 5.8 / 12;
        } else if (month >= 24) {
            interestRate = 6.7 / 12;
        }
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money *   interestRate / 100 * month;
        }
        System.out.println("số tiền sau "+month+ " tháng bạn nhận được là: "+totalInterest);
    }
    }

