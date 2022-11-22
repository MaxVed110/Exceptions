package lesson;

public class PhoneBook {
    String name;
    int age;
    String number;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ' ' + age + ' ' + number;
    }
}

