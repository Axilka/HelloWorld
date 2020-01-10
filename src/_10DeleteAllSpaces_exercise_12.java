import java.util.Scanner;

public class _10DeleteAllSpaces_exercise_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] massParts = line.split(" ");
        for(String i : massParts) {
            System.out.print(i);
        }
    }
}
