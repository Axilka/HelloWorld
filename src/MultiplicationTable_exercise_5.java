import java.util.Scanner;

public class MultiplicationTable_exercise_5
{
    public static void main(String[] args)
    {
        short zn1=1;
        int i, num;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        num = in.nextInt();

        i = num*zn1;
        System.out.printf("%d*%d=%d\n",num, zn1, i);
        i = num*++zn1;
        System.out.printf("%d*%d=%d\n",num, zn1, i);
        i = num*++zn1;
        System.out.printf("%d*%d=%d\n",num, zn1, i);
        i = num*++zn1;
        System.out.printf("%d*%d=%d\n",num, zn1, i);
        i = num*++zn1;
        System.out.printf("%d*%d=%d\n",num, zn1, i);
        i = num*++zn1;
        System.out.printf("%d*%d=%d\n",num, zn1, i);
        i = num*++zn1;
        System.out.printf("%d*%d=%d\n",num, zn1, i);
        i = num*++zn1;
        System.out.printf("%d*%d=%d\n",num, zn1, i);
        i = num*++zn1;
        System.out.printf("%d*%d=%d\n",num, zn1, i);
        i = num*++zn1;
        System.out.printf("%d*%d=%d\n",num, zn1, i);
    }
}
