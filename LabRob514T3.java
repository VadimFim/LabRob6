import java.util.Scanner;

public class LabRob514T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Введіть перше дробове число: ");
        if (scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
            System.out.println("Введіть друге дробове число: ");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
                System.out.println("Введіть третє дробове число: ");
                if (scanner.hasNextDouble()) {
                    num3 = scanner.nextDouble();
                    if (num1 >= num2 && num1 >= num3) {
                        System.out.println(num1 + " найбільше дробове число");
                    } else if (num2 >= num1 && num2 >= num3) {
                        System.out.println(num2 + " найбільше дробове число");
                    } else {
                        System.out.println(num3 + " найбільше дробове число");
                    }
                } else System.out.println("Ви ввели не дробове число");
            } else System.out.println("Ви ввели не дробове число");
        } else System.out.println("Ви ввели не дробове число");
    }
}
