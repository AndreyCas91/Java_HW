package hw6.animals;

public class Animals {
    String name;
    int run;
    int swim;
    static int x;

    public Animals(String name) {
        this.name = name;
        x++;
    }

    public void running(int d){}

    public void swimming(int d){}

    public static void sumX(){
        System.out.println("Было создано " + x + " животных.");
    }

}