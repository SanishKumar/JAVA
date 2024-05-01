class A{
    public A(){
        System.out.println("in A");
    }
}
class B extends A{
    public B(){
        System.out.println("in B");
    }
}


class Demo{
    public static void main(String[] args) {
        B obj = new B();
    }
}