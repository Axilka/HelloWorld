import java.util.Scanner;

public class _12TypeConversion_exercise_14 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");

        String S = in.nextLine();
        System.out.println(S);

        int X = Integer.parseInt(S);
        System.out.println(X);

        Double Y = (double) X;
        System.out.println(Y);
    }
}
