import java.util.Scanner;

public class _17FinalTask_1 {
    public static void main(String[] args)
    {
        int i, yInt;
        double xInt = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        String num = in.nextLine();

        char[] massChar = num.toCharArray();
        int size = massChar.length;
        int[] massInt = new int[size];

        for(i = 0; i < massChar.length; i++) {
            massInt[i] = Character.getNumericValue(massChar[i]);
        }

        for(int len = massInt.length-1; len >= 0; len--) {
            xInt = xInt + massInt[len]*(Math.pow(2,len));
        }

        yInt = (int)xInt;
        System.out.println("Биннарное число: " + num + " равно десятичному: " + yInt);
    }
}
