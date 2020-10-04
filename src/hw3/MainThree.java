package hw3;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MainThree {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {


//        1 задание

        System.out.println("Привет, давай сыграем в игру!");
        int x;
        do{
            gameGuessNumber(3);
            System.out.println("Если хочешь повторить игру, напиши 1.");
            x = sc.nextInt();
        } while(x == 1);


    }

    public static void gameGuessNumber(int n){
        int numb = random.nextInt(10);
        int userNumb;

        for (int i = 0; i < n; i++) {
            System.out.printf("Отгадай число от 0 до 9, у тебя есть %d попытки.\n", n - i);
            userNumb = sc.nextInt();
            if(userNumb == numb){
                System.out.println("Молодец, ты угадал!");
                return;
            } else if(userNumb < numb){
                System.out.println("Твое число меньше загаданного.");
            } else {
                System.out.println("Твое число больше загаданного.");
            }

        }
        System.out.println("Увы, попытки закончились.");


        }












}
