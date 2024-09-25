import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Kalkulator Sederhana");
        System.out.println("--------------------");
        System.out.print("Masukkan angka pertama: ");
        num1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Hasil: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Hasil: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Hasil: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Hasil: " + result);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                break;
        }

        scanner.close();
    }
}
