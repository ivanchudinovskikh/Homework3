public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}