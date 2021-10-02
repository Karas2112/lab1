public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    Car car;

    public Human() {
        this.salary = 1200.0;
    }

    void setSalary(Double salary) {
        if(salary<0){
            System.out.println("Nie można przypisać ujemnej wartości do wypłaty");
        }
        if (salary >= 0) {
            this.salary = salary;
        System.out.println("nowe dane zostały wyłane do systemu księgowego");
        System.out.println("Koniecznie odbierz aneks od umowy od pani Hani z kadr");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać");

        }
    }

    Double getSalary() {
        System.out.println("wynagrodzenie: " + this.salary);

        return this.salary;
    }
}
