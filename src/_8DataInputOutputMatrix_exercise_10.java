import java.util.Scanner;

public class _8DataInputOutputMatrix_exercise_10 {
    public static void main(String[] args)
    {
        int i, j, x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте размер двумерного массива по вертикали: ");
        x = in.nextInt();
        System.out.print("Задайте размер двумерного массива по горизонтали: ");
        y = in.nextInt();

        int mass[][] = new int[x][y];

        for (i = 0;i < x; i++)
        {
            for (j = 0;j < y; j++)
            {
                System.out.print("Значение ячейки {" + i + "}{" + j + "}: ");
                mass[i][j] = in.nextInt();
            }
        }

        System.out.print("Вывод первой строки массива умноженной на 3:  ");
        for (j = 0; j < y; j++)
        {
            mass[0][j] = mass[0][j] * 3;
            System.out.print("{" + mass[0][j] + "}");
        }
    }
}
