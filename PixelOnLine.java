import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class PixelOnLine {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите координаты точек: ");
        System.out.print("x1 = ");
        int x1 = input.nextInt();
        System.out.print("y1 = ");
        int y1 = input.nextInt();
        System.out.print("x2 = ");
        int x2 = input.nextInt();
        System.out.print("y2 = ");
        int y2 = input.nextInt();
        System.out.print("x3 = ");
        int x3 = input.nextInt();
        System.out.print("y3 = ");
        int y3 = input.nextInt();
        if (x1 == x2 && x1 == x3){
            System.out.println("Точки расположены на одной прямой");
        }
        else if (y1 == y2 && y1 == y3){
            System.out.println("Точки расположены на одной прямой");
        }
        else if (x1 == y1 && x2 == y2 && x3 == y3){
            System.out.println("Точки расположены на одной прямой");
        }
        else  System.out.println("Точки НЕ расположены на одной прямой");

    }
}
