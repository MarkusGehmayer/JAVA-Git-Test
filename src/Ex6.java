import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number here: ");

        int a = sc.nextInt();
        System.out.println("second number here: ");

        int b = sc.nextInt();
        System.out.println("third number here: ");

        int c = sc.nextInt();

        if(a >= b && a >= c) {
            System.out.println(a + " is the biggest number, " + b + " is the second biggest number, " + c + " is the third biggest number");
        } else if (b >= a && b >= c) {
            System.out.println(b + "is the biggest number");
        } else {
            System.out.println(c + " is the biggest number");
        }

    }
    }

