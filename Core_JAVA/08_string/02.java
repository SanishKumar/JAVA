import java.util.*;

class Strings {
    public static void main(String[] args) {
        // String Declaration
        String name = "Sanish Kumar";
        Scanner sc = new Scanner(System.in);
        String names = sc.next();
        System.out.println("Your name is: "+ name);
        System.out.println("Your name is: "+ names);

        //charAt
        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }

        // compare
        if(name.compareTo(names) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
