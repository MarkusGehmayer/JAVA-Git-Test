import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
    // A4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();

        if(first < second){
            System.out.println(second + " is the maximum");
        }else{
            System.out.println(first + " is the maximum");
        }

    }
}
