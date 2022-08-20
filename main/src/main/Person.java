import java.time.*;
public class Person {

    public enum Sex {
        MALE, FEMALE, OTHER
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    Integer age;

    public Person() {
        name = "Gladis";
        birthday = LocalDate.of(1990, 1, 1);
        gender = Sex.FEMALE;
        emailAddress = "ilovekittens@hotmail.net";
        age = 23;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "Birthday: " + birthday + "\n"
                + "Sex: " + gender + "\n"
                + "Age: " + age + "\n"
                + "Email: " + emailAddress + "\n";
    }
    
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p);
    }


}
