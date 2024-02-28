class Calculator{
    int a;
    public int add(int num1, int num2){ // Method Overloading
        // int r = num1 + num2;
        return num1+num2;
    }
    public int add(int num1, int num2, int num3){
        return num1+num2;
    }
    public double add(double num1, int num2){
        return num1+num2;
    }
}

class Intro {
    public static void main(String a[]){
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();

        int result = calc.add(num1,num2);

        // int result = num1 + num2;

        System.out.println(result);
    }
}

