import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        while (n != 0) {
            count++;
            n = scanner.nextInt();
        }
        System.out.print(count);
    }
}