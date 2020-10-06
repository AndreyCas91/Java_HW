package hw4;

import java.util.Random;
import java.util.Scanner;

public class MainFour {
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if(checkWinTwo(DOT_X, DOTS_TO_WIN)){
                System.out.println("Вы победитель!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }

            iiWin();
            printMap();
            if(checkWinTwo(DOT_O, DOTS_TO_WIN)){
                System.out.println("Компьютер победил!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }


    static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Input coord X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));

        map[y][x] = DOT_X;
    }

    static void aiTurn() {

        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_O;

    }



    static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

// с этого места создавал методы!!!!!!!!!!!!!!!!!!!!!!
//!!!!!!!!!!!!!!!!!!!!!!
//!!!!!!!!!!!!!!!!!!!!!!!


    static boolean checkWinTwo(char c, int n){

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if(diagonalCheck(c, n, i, j)){
                    return true;
                }
                if(reverseDiagonalCheck(c, n, i, j)){
                    return true;
                }
                if(horisontlCheck(c, n, i, j)){
                    return true;
                }
                if(verticalCheck(c, n, i, j)){
                    return true;
                }
            }

        }
        return false;
    }

    static boolean horisontlCheck (char c, int n, int x, int y){
        for (int i = 0; i < n; i++) {
            if(y + i >= map.length){
                return false;
            } else if(map[x][y + i] != c){
                    break;
            } else if(map[x][y + i] == c){
                if(i == n - 1){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean verticalCheck (char c, int n, int x, int y){
        for (int i = 0; i < n; i++) {
            if(x + i >= map.length){
                return false;
            } else if(map[x + i][y] != c){
                break;
            } else if(map[x + i][y] == c){
                if(i == n - 1){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean diagonalCheck (char c, int n, int x, int y){
        for (int i = 0; i < n; i++) {
            if(x + i >= map.length || y + i >= map.length){
                return false;
            } else if(map[x + i][y + i] != c){
                break;
            } else if(map[x + i][y + i] == c){
                if(i == n - 1){
                    return true;
                }
            }

        }
        return false;
    }

    static boolean reverseDiagonalCheck (char c, int n, int x, int y){
        for (int i = 0; i < n; i++) {
            if(x - i < 0 || y + i >= map.length){
                return false;
            } else if(map[x - i][y + i] != c){
                break;
            } else if(map[x - i][y + i] == c){
                if(i == n - 1){
                    return true;
                }
            }

        }
        return false;
    }

    static void iiWin (){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if(map[i][j] == DOT_EMPTY){
                    map[i][j] = DOT_X;
                         if(checkWinTwo(DOT_X, DOTS_TO_WIN)){
                             map[i][j] = DOT_O;
                             return;
                         } else {
                             map[i][j] = DOT_EMPTY;
                         }

                }
            }
        }

        aiTurn();

    }



}
