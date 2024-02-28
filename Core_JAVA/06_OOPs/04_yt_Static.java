class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    public void show(){
        System.out.println(brand+" : "+ price+" : "+name);
    }
}


class Demo{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1000;
        Mobile.name = "APPY";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 100;
        Mobile.name = "SAM";

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
}