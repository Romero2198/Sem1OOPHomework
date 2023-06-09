package Part1.Homework.Ex2;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.width = weight;
    }

    public Rectangle(int xw) {
        this.height = xw;
        this.width = xw;
    }

    public Rectangle() {
    }

    public int calculateArea() {
        return this.width * this.height;
    }

    public int calculatePerimeter() {
        return 2 * (this.width * this.height);
    }

    public void showResults(){
        System.out.println("Прямоугольник с шириной  = " + this.width + " и высотой = " +
                this.height + " имеет площадь = " + calculateArea() +
                " и периметр = " + calculatePerimeter());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWeight(int weight) {
        this.width = weight;
    }

}
