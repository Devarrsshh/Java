import java.util.Scanner;

public class CWH_05_Exercise1 {
    public static void main(String[] args) {
        System.out.println("Please write your marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Physics");
        float a = sc.nextFloat();
        System.out.println("Chemistry");
        float b = sc.nextFloat();
        System.out.println("Maths");
        float c = sc.nextFloat();
        System.out.println("English");
        float d = sc.nextFloat();
        System.out.println("Computer");
        float e = sc.nextFloat();
        float sum = (a + b + c + d + e) / 500 * 100;
        System.out.println("Total percentage is " + sum);
    }
}
