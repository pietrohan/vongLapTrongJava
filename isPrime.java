import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số: ");
        int number = sc.nextInt();
        boolean check = true;
        if (number <2){
            System.out.println("đây không pải là số nguyên tố");
    }
        for (int i = 2;i<number;i++){
            if (number %i ==0){
                check =false;
                System.out.println(number+ " không phải là số nguyên tố");
                break;
            }
        }
        if(check==true){
            System.out.println(number + " là số nguyên tố");
        }
        }
    }

