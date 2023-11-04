public class AdditionalQuest {
    public static void main(String[] args) {
        int time = 0;
        int price = 0;
        int temp;
        for (int i = 100; i >= 0; i = i-6, time++) {
            temp = i * 100;
            price = price + temp;
        }
        System.out.println("На хранение гречки уйдет = " + price + "руб");
    }
}
