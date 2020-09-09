import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int n = scanner.nextInt();
        int bridgeHeight;
        boolean notCrash = true;
        for (int i = 1; i <= n; i++) {
            bridgeHeight = scanner.nextInt();
            if (height >= bridgeHeight) {
                System.out.print("Will crash on bridge " + i);
                notCrash = false;
                break;
            }
        }
        if (notCrash) {
            System.out.print("Will not crash");
        }
    }
}