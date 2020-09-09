import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int smallerParts = 0;
        int perfectParts = 0;
        int largerParts = 0;

        for (int i = 0; i < n; i++) {
            int part = scanner.nextInt();
            if (part == -1) {
                ++smallerParts;
            } else if (part == 0) {
                ++perfectParts;
            } else {
                ++largerParts;
            }
        }
        System.out.print(perfectParts + " " + largerParts + " " + smallerParts);
    }
}