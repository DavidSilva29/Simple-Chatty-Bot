import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        int count = 0;

        while (sum < h) {
            sum += a;
            count++;
            if (sum >= h) {
                break;
            }
            sum -= b;
        }
        System.out.print(count);
    }
}