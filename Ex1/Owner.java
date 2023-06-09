package Part1.Homework.Ex1;

public class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public Owner() {
        this.name = "Хозяин";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
