package hw2;

import java.util.Arrays;

public class MainTwo {
    public static void main(String[] args) {

//        1 задание
        int[] numbers = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1};

        wordNumber(numbers);
        numbersOpposite(numbers);
        wordNumber(numbers);

        System.out.println();
//        2 задание

        int[] numb = new int[8];
        numberFill(numb);


        System.out.println();
//        3 задание

        int[] massNumbers = {1, 4, 7, 11, 34, 12, 4, 5, 2};
        wordNumber(massNumbers);
        doubleNumder(massNumbers);

        System.out.println();
//        4 задание

        int[][] square = new int[7][7];
        squareNumberH(square);
        squareNumberV(square);
        wordNumber2D(square);


        System.out.println();


//        5 задание

        int[] maxNumber = {5, 1, 4, 16, 56, 100, 43, 54, 121, 76, 12, -4, 431, 0, -76};
        seekMaxNumber(maxNumber);

        System.out.println();

//        6 задание

        int[] equality = {8, 2, 1, 1, 1, 1, 2};

        System.out.println(equalityMass(equality));
        System.out.println();

//        7 задание



        int[] number = {1, 2, 3, 4, 5, 6};
        moveNumbers(number, -2);





    }

    public static void moveNumbers(int[] arr7, int n){

        if(n < 0){
            n = arr7.length + n;
        }

        for(int i = 0; i < n; i++){
            int x = (arr7[arr7.length - 1] - arr7[0]);

            for(int j = arr7.length - 1; j > 0; j--){
                arr7[j] = arr7[j - 1];

            }
        arr7[0] = arr7[0] + x;
        }

        System.out.println(Arrays.toString(arr7));
    }










    /**
     * когда писал через =+, не видел первое число в массиве, обьясните в кратце, в чем заключается разница.
     *
     * */
    public static boolean equalityMass(int[] arr6){

            for(int i = 1; i < arr6.length; i++) {

                int stop = 0;
                int j = 0;
                int start = 0;
                int x = i;

                while(x < arr6.length) {
                    start = start + arr6[x];  //!!!!!!!! изначально писал start =+ arr6[x],
                    x++;
                }

                while(j < i) {
                    stop = stop + arr6[j]; //и тут тоже stop =+ arr6[j]
                    j++;
                }

                if (start == stop) {
                    return true;
                }
            }
            return false;
    }









    public static void numbersOpposite(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return;
    }


    public static void numberFill(int[] arr2){
        int j = 0;
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = j;
            j += 3;
        }
        wordNumber(arr2);
    }

    public static void doubleNumder(int[] arr3) {
        for(int i = 0; i < arr3.length; i++){
            if(arr3[i] < 6){
                arr3[i] *= 2;
            }
        }
        wordNumber(arr3);
    }

    public static void squareNumberH(int[][] arr4) {
        for(int i = 0; i < arr4.length; i++){
            for(int j = 0; j < arr4[i].length; j++){
                if(i == j){
                    arr4[i][j] = 1;
                }
            }
        }
    }

    public static void squareNumberV(int[][] arr4) {
        for(int i = 0; i < arr4.length; i++){
            for(int j = 0; j < arr4[i].length; j++){
                if((i + j) == (arr4.length - 1)){
                    arr4[i][j] = 1;
                }
            }
        }
    }

    public static void seekMaxNumber(int[] arr5) {
        int j = 0;
        for(int i = 0; i < arr5.length; i++){
            while(arr5[i] >= arr5[j]){
                if(j == arr5.length - 1){
                    System.out.println(arr5[i]);
                    return;
                }
                j++;
            }
        }
    }







    public static void wordNumber2D(int[][] arrMax){
        for(int i = 0; i < arrMax.length; i++){
            for(int j = 0; j < arrMax[i].length; j++){
                System.out.print(arrMax[i][j] + "  ");
            }
            System.out.println();
        }

    }


    public static void wordNumber(int[] arrMax){
        for(int i = 0; i < arrMax.length; i++){
            System.out.print(arrMax[i] + "  ");
        }
        System.out.println();
    }
}
