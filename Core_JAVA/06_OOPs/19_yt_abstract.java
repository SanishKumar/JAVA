abstract class car{
    public abstract void drive();

    public void playmusic(){
        System.out.println("play music");
    }
}

class WagonR extends car{
    public void drive(){
        System.out.println("diving...");
    }
}

class Demo{
    public static void main(String[] args) {
        car obj = new WagonR();
        obj.drive();
        obj.playmusic();
    }
}