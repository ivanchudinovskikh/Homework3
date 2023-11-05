import java.util.Scanner;

public class AdditionalQuest {
    public static void main(String[] args) {
        System.out.print("В течении какого времени будем есть гречку = ");
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int i;
        int time = 0;
        int price = 0;
        int temp;

        for (i = 100; i >= 0; i = i - 6, time++) {
            if(month == time) {
                break;
            }
            temp = i * 100;
            price = price + temp;
        }
        if(i <= 0) {
            System.out.println("Гречка закончилась");
        }
        System.out.println("На хранение гречки уйдет = " + price + "руб");
    }
}
