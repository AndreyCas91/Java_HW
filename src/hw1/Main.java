package hw1;

public class Main {
    public static void main(String[] args) {
        byte a = 121;
        short b = 21098;
        int c = 54009789;
        long d = -1230084767;
        float e = 543.968F;
        double f = 1235.7765;
        char g = '\u1111';
        boolean h = true;

        System.out.println(Function(5, 7, 19, 84));

        System.out.println(twoNumbers(-23, 43));

        Numbers(-37);

        System.out.println(TrueNumber(-76));

        Name("Андрей");
    }

    static int Function(int a, int b, int c, int d){
        return (short) (a * (b - (c / d)));
    }

    static boolean twoNumbers(int a, int b){
        if((a + b) >= 10 && (a + b) <= 20){
            return true;
        } else {
            return false;
        }
    }

    static void Numbers(int a){
        if(a >= 0){
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }

    static boolean TrueNumber(int a){
        if(a < 0){
            return true;
        } else {
            return false;
        }
    }

    static void Name(String a){
        System.out.println("Привет " + a);
    }
}
