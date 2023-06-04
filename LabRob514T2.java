import java.util.Scanner;
public class LabRob514T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        for (int i = 0; i < 5; i++) {
            str += scanner.next().substring(0, 1) + " ";
        }
        System.out.println(str);
    }
}
