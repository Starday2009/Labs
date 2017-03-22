import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
           System.out.println("1 для программы, для выхода любую другую");
           Integer inp;
           Scanner sc = new Scanner(System.in);
           inp = sc.nextInt();

           switch (inp) {
               case 1:
                   Scanner in = new Scanner(System.in);
                   double a, b, c, s;
                   System.out.println("Введите а: ");
                   a = in.nextDouble();
                   System.out.println("Введите b: ");
                   b = in.nextDouble();
                   System.out.println("Введите угол: ");
                   c = in.nextDouble();
                   s = a * b * Math.sin(c);
                   System.out.print("Площадь равна1: " + s);
                   break;
               case 0:
                   System.exit(0);
               }
           }
       }





