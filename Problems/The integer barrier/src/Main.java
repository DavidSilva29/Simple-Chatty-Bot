import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;
        while (scanner.hasNext()) {
            num = scanner.nextInt();
            if (num == 0) {
                System.out.print(sum);
                break;
            }
            sum += num;
            if (sum >= 1000) {
                System.out.print(sum - 1000);
                break;
            }
        }
    }
}