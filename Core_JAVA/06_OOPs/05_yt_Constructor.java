class Human{
    private int age;
    private String name;

    public Human(){
        age = 21;
        name = "Kumar";
    }

    public Human(int a, String name){
        age = a;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Demo{
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(20, "Sanish");
        // obj.setAge(20);
        // obj.setName("Sanish");

        System.out.println(obj.getName()+":"+obj.getAge());
        System.out.println(obj1.getName()+":"+obj1.getAge());
    }
}