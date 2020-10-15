package hw6;

import hw6.animals.*;

public class MainSix {
    public static void main(String[] args) {

        Animals[] animals = {
                new Cat("Васька"),
                new Dog("Джек"),
                new Cat("Мурзик"),
                new Cat("Мурка"),
                new Dog("Мухтар"),
                new Cat("Рыжий"),
                new Dog("Найда"),
                new Dog("Веник"),
                new Dog("Рекс")
        };

        int[] testRun = {100, 345, 212, 150, 654, 314, 500, 76, 467};
        int[] testSwim = {3, 4, 7, 1, 12, 6, 8, 10, 15};

        for (int i = 0; i < animals.length; i++) {
            animals[i].running(testRun[i]);
            animals[i].swimming(testSwim[i]);
            System.out.println();
        }

        System.out.println();

        Animals.sumX();
        Cat.sumX();
        Dog.sumX();

    }

}
