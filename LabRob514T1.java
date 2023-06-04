import java.util.Scanner;

public class LabRob514T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        for (int i = 0; i < 5; i++) {
            result = result.concat(scanner.next()) + " ";
        }
        System.out.println(result);
    }
}