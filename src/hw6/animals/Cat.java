package hw6.animals;

public class Cat extends Animals {
    static int x;

    public Cat(String name) {
        super(name);
        x++;
    }

    @Override
    public void running(int d) {
        if(d > 0 && d <=200){
            System.out.println(name + " пробежал " + d + " метров!");
        } else{
            System.out.println(name + " не смог пробежать " + d + " метров.");
        }
    }

    @Override
    public void swimming(int d) {
        System.out.println("Коты не умеют плавать...");
    }

    public static void sumX(){
        System.out.println("Было создано " + x + " котов.");
    }

}
