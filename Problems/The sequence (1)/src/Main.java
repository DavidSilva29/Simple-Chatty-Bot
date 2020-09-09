import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        boolean incomplete = true;
        for (int i = 1; incomplete; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                count++;
                if (count == n) {
                    incomplete = false;
                    break;
                }
            }
        }
    }
}