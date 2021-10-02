import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    private Car car;

    public Human() {
        this.salary = 1200.0;
    }

    void setSalary(Double salary) {
        if (salary >= 0) {
            System.out.println("nowe dane zostały wyłane do systemu księgowego");
            System.out.println("Koniecznie odbierz aneks od umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać");
            this.salary = salary;

        } else {
            System.out.println("Nie można przypisać ujemnej wartości do wypłaty");
        }

    }

    Double getSalary() {
        System.out.println(new Date());
        System.out.println("wynagrodzenie: " + this.salary);

        return this.salary;
    }

    void setCar(Car newCar) {
        if (this.salary > newCar.value) {
            System.out.println("Udało sie kupic auto za gotówkę");
            this.car = newCar;
        } else if (this.salary >= newCar.value / 12) {
            System.out.println("Udało sie kupic auto na kredyt");
            this.car = newCar;
        } else {
            System.out.println("lol biedak");
        }

    }

    Car getCar() {
        return this.car;
    }

}
