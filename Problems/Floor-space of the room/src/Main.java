import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();
        double a;
        double b;
        double c;
        double r;
        switch (shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                System.out.print(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.print(a * b);
                break;
            case "circle":
                r = scanner.nextDouble();
                System.out.print(r * r * 3.14);
                break;
            default:
                break;
        }
    }
}