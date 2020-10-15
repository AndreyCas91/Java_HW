package hw5;

public class MainFive {
    public static void main(String[] args) {
        Employee[] persArr = new Employee[5];

        persArr[0] = new Employee("Иванов Петр", "Слесарь", "ivanov@lmail.ru", "88001234455", 25000, 34);
        persArr[1] = new Employee("Сидоров Семен", "Мастер", "sidorov@lmail.ru", "88001231010", 35000, 30);
        persArr[2] = new Employee("Хрипов Евгений", "Водитель", "hripov@lmail.ru", "88008786556", 30000, 42);
        persArr[3] = new Employee("Кузнецов Игорь", "Кладовщик", "kuznecov@lmail.ru", "88009853212", 32000, 51);
        persArr[4] = new Employee("Конюхов Андрей", "Директор", "konyuhov@lmail.ru", "88008001313", 45000, 28);

        for (int i = 0; i < persArr.length; i++) {
            if(persArr[i].getAge() >= 40){
                persArr[i].info();
            }
        }



    }
}
