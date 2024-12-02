import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        sum();
    }

    // return the value
    public static int sum(){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter number 1: ");
            int num1 = in.nextInt();
            System.out.println("Enter number 2: ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            return sum;
        }
    }
}