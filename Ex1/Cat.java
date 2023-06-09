package Part1.Homework.Ex1;

public class Cat extends Owner{
    private String name;
    private int age;

    public Cat(String name, String name1, int age) {
        super(name);
        this.name = name1;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
        this.name = "Кот";
        this.age = 1;
    }

    public void greet(){
        System.out.println("Мяу, меня зовут " + this.name + " Мне " + this.age + " года(лет) "
        + " Мой владелец - " + super.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
