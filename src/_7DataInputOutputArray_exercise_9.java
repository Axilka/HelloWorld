import java.util.Scanner;

public class _7DataInputOutputArray_exercise_9 {
    public static void main(String[] args)
    {
        int i, size ;
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте размер одномерного массива: ");
        size = in.nextInt();

        int mass[] = new int[size];
        for (i = 0;i < size; i++)
        {
            System.out.print("Введите число в ячейку " + i + ": ");
            mass[i] = in.nextInt();
        }

        System.out.print("Массив содержит значения: ");
        for (i = 0;i < size; i++)
        {
            mass[i] = mass[i] * 2;
            System.out.print("{" + mass[i] + "}");
        }
    }
}
