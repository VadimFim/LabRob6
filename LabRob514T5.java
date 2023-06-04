import java.util.Scanner;

public class LabRob514T5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (str1.length() > str2.length()) {
            System.out.println(str1 + " більше");
        } else {
            System.out.println(str2 + " більше");
        }
    }
}
