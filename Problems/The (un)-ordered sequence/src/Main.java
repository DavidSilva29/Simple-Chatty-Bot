import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2;

        boolean isAscending = false;
        boolean isDescending = false;

        n1 = scanner.nextInt();
        int count = 0;

        while (scanner.hasNext()) {
            n2 = scanner.nextInt();
            count++;

            if (n1 > n2 && n2 != 0) {
                isDescending = true;
            } else if (n1 < n2 && n2 != 0) {
                isAscending = true;
            }

            if (n2 == 0) {
                break;
            }

            n1 = n2;
        }

        if (count == 1) {
            System.out.print(true);
        } else if (isAscending && !isDescending) {
            System.out.print(true);
        } else if (isDescending && !isAscending) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}