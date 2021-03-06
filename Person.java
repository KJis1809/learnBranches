public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void sayHi() {
        System.out.println(name + " says: \"Hi everyone!\"");
    }

    public String toString() {
        return name + " " + surname + " " + age;
    }
}