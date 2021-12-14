package lesson4;

public class User {
    String name;
    String surname;
    int age;
    Gender sexOfAPerson;
    Adress adress;

    public User(String name, String surname, int age, Gender sexOfAPerson, String city, String country) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sexOfAPerson = sexOfAPerson;
        adress = new Adress(city, country);
    }

    public String getInfo(String name, String surname) {
        return name + surname;

    }

    public int increaseInAge(int age) {
        return age + 1;
    }


    public void printInfo(String name, String surname, int age, Gender type, String city, String country) {
        sexOfAPerson = type;
        this.name = name;
        this.surname = surname;
        this.age = age;

        adress = new Adress(city, country);

    }


    public class Adress {
        private String city;
        private String country;

        public Adress(String city, String country) {
            this.city = city;
            this.country = country;

        }
    }
}
