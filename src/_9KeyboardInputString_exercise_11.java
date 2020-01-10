import java.util.Scanner;

public class _9KeyboardInputString_exercise_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        line = String.format("Текст введённый с клавиатуры: " + "%s", line);
        System.out.println(line);
    }
}
