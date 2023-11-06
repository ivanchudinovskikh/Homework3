import java.util.Scanner;

public class SimpleNum {
    public static void main(String[] args) {
        int temp;
        boolean check = true;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int num = scan.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                check = false;
                break;
            }
        }
        if (num == 1 | num == 0) {
            System.out.println("Ни составное и не простое");
        }
        else if (check) {
            System.out.println("Простое число");
        }
        else System.out.println("Составное число");
    }
}
