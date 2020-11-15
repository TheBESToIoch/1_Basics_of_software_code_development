import javax.sound.midi.Soundbank;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Drob {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число в виде nnn.ddd: ");
        String str = new String();
        String str1 = new String();
        String str2 = new String();
        str = input.nextLine();
        for (int i = 0; i < 3; i++){
            str1 = str;
        }
        for (int i = 3; i < 7; i++){
            str2 = str;
        }
        System.out.print(str.substring(4,7));
        System.out.print(".");
        System.out.print(str.substring(0,3));
    }
}


