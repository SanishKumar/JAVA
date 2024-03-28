class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

class Demo{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Sanish");

        System.out.println(obj.getName()+":"+obj.getAge());
    }
}