import java.util.*;

class Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }
}