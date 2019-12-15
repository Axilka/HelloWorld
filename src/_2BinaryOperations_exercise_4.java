import java.util.Scanner;

public class _2BinaryOperations_exercise_4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        String num = in.nextLine();
        System.out.println(Integer.parseInt(num,2));
    }
}