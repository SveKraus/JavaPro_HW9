package HW16;

public class Person {

    String name;


    public Person(String name) {
        this.name = name;


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
