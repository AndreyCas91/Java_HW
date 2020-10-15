package hw5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Employee(String fio, String position, String email, String telephone, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.printf("Сотруднк %s %s %s %s %d %d\n", fio, position, email, telephone, salary, age);
    }

    public int getAge(){
        return age;
    }


}
