import java.util.Scanner;

public class _5DataOutput_exercise_7
{
    public static void main(String[] args)
    {
        int number, X=5, Y=10, Z=15;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        number = in.nextInt();

        switch (number) {
            case 5:
                System.out.print("Данное значение имеется в константах");
                break;
            case 10:
                System.out.print("Данное значение имеется в константах");
                break;
            case 15:
                System.out.print("Данное значение имеется в константах");
                break;
            default:
                System.out.print("Такой константы нет !");
        }
    }
}