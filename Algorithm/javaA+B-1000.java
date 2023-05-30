import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        sum(A, B);
    }

    public static void sum(int A, int B) {
        System.out.println(A + B);
    }
}