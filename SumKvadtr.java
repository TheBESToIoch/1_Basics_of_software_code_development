import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;


public class SumKvadtr {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Сумма квадратов первых ста чисел: ");
        int sum = 0;
        for (int i = 0; i <= 100; i++){
            sum = sum + i*i;
            //System.out.println(sum);
        }
        System.out.println(sum);
}
}

