import java.util.Scanner;

public class _4ArithmeticOperations_exercise_6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = in.nextInt();
        System.out.print("Введите число y: ");
        double y = in.nextInt();
        System.out.print("Введите число z: ");
        double z = in.nextInt();

        double sr = (x+y+z)/3;
        System.out.printf("Среднее арифметическое = %.2f\n", sr);
        int delenie = (int)sr/2;
        System.out.printf("Деление среднего арифметического = %d", delenie);

        if (delenie > 3)
            System.out.print("Программа выполнена корректно");
    }
}
