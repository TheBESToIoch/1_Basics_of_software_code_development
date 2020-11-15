import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Cifri {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = input.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = input.nextInt();
        if (number1<0){
            number1 *=-1;
        }
        int number_create;
        System.out.println("Цифры первого числа: ");
        for (;number1>0;number1 /=10){
            number_create = number1%10;
            System.out.print(number_create + ", ");
        }
        System.out.println();
        System.out.println("Цифры второго числа: ");
        int number_create2;
        for (;number2>0;number2 /=10){
            number_create2 = number2%10;
            System.out.print(number_create2 + ", ");
        }
    }

}
