import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int end = scanner.nextInt();
        int max = 4;
        for (int i = 0; i < end; i++) {
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > max) {
                max = num;
            }
        }
        System.out.print(max);
    }
}