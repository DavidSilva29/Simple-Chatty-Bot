import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend && 15 <= cups && cups <= 25) {
            System.out.print(true);
        } else if (!isWeekend && 10 <= cups && cups <= 20) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}