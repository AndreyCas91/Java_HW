package hw6.animals;

public class Dog extends Animals {
    static int x;

    public Dog(String name) {
        super(name);
        x++;
    }

    @Override
    public void running(int d) {
        if(d > 0 && d <=500){
            System.out.println(name + " пробежал " + d + " метров!");
        } else{
            System.out.println(name + " не смог пробежать " + d + " метров.");
        }
    }

    @Override
    public void swimming(int d) {
        if(d > 0 && d <=10){
            System.out.println(name + " проплыл " + d + " метров!");
        } else{
            System.out.println(name + " не смог проплыть " + d + " метров.");
        }
    }

    public static void sumX(){
        System.out.println("Было создано " + x + " собак.");
    }

}
